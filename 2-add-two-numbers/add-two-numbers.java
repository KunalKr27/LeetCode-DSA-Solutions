/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0); 
        ListNode t1 = l1, t2 = l2, t3 = result;
        int carry = 0;

        while (t1 != null || t2 != null) {
            int x,y;
            if(t1!=null){
                x = t1.val;
            }
            else x = 0;

            if(t2!=null){
                y = t2.val;
            }
            else y = 0;

            int sum = x + y + carry;

            carry = sum / 10;
            t3.next = new ListNode(sum % 10);
            t3 = t3.next;

            if (t1 != null) t1 = t1.next;
            if (t2 != null) t2 = t2.next;
        }

        if (carry > 0) {
            t3.next = new ListNode(1);
        }

        return result.next; 
    }
}
