class Solution {
    private int rev(int num){
        int rev = 0;
        while(num>0){
            rev = rev*10 + num%10;
            num/=10;
        }
        return rev;
    }
    public int countNicePairs(int[] nums) {
        HashMap<Integer,Long> map = new HashMap<>();
        long pairCount = 0;
        int MOD = 1000000007;
        for(int num : nums){
            int diff = num-rev(num);
            map.put(diff,map.getOrDefault(diff,0L)+1);
        }
        for(int key : map.keySet()){
            long count = map.get(key);
            pairCount = (pairCount + (count * (count - 1) / 2) % MOD) % MOD;
        }
        return (int)pairCount;
    }
}