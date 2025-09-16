// Optimised solution without using An extra list for inorder array.
class Solution {
    private int count = 0;
    private int result = -1;

    public void inorderHelper(TreeNode root, int k){
        if(root==null) return;
        inorderHelper(root.left,k);
        count++;
        if(count==k){
            result=root.val;
        }
        inorderHelper(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        inorderHelper(root,k);
        return result;
    }
}