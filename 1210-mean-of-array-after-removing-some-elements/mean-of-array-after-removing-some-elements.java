import java.util.Arrays;

class Solution {
    public double trimMean(int[] arr) {
        int size = arr.length;
        Arrays.sort(arr);
        int m = (int) (0.05 * size); 
        int sum = 0;
        for (int i = m; i < size - m; i++) {
            sum += arr[i];
        }
        int totalNum = size - 2 * m;
        return (double) sum / totalNum; 
    }
}
