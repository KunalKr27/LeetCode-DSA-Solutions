class Solution {
    private String reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();
        int count = 0;
        for(int i=0; i<words.length; i++){
            if(set.contains(reverse(words[i]))){
                count ++;
                set.remove(reverse(words[i]));
            }
            else{
                set.add(words[i]);
            }
        }
        return count;
    }
}