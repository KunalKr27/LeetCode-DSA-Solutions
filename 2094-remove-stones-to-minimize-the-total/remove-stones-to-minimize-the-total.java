import java.util.PriorityQueue;

public class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int pile : piles) maxHeap.add(pile);
        while (k-- > 0) {
            int top = maxHeap.poll();
            maxHeap.add(top - top / 2);
        }
        int sum = 0;
        while (!maxHeap.isEmpty()) sum += maxHeap.poll();
        return sum;
    }
}
