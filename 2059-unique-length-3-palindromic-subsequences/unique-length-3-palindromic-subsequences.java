class Solution {
    public int countPalindromicSubsequence(String s) {
        HashMap<Character,Integer> fMap = new HashMap<>();
        HashMap<Character,Integer> lMap = new HashMap<>();
        int count = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!fMap.containsKey(ch)){
                fMap.put(ch,i);
            }
                lMap.put(ch,i);
        }
        for(Character key : fMap.keySet()){
            if(!lMap.containsKey(key))continue;
            int start = fMap.get(key);
            int end = lMap.get(key);
            if (end - start < 2) continue;
            HashSet<Character> set = new HashSet<>();
            for(int i = start+1;i<end;i++){
                set.add(s.charAt(i));
            }
                count += set.size();
            }
            return count; 
        }
}