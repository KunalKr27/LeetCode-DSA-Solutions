class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0;
        int maxLen = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(j<s.length()){
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                i = Math.max(i,map.get(ch)+1);
            }
            int len = j-i+1;
            maxLen = Math.max(len,maxLen);
            map.put(ch,j);
            j++;
        }
        return maxLen;
    }
}