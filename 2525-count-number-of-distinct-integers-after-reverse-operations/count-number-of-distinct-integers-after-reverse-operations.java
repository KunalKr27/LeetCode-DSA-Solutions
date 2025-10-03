class Solution {
    private int reverse(int num){
        int rev = 0;
        while(num>0){
            int lastDigit = num%10;
            rev = rev*10+lastDigit;
            num /= 10;
        }
        return rev;
    }
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
            set.add(reverse(nums[i]));
        }
        return set.size();
    }
}