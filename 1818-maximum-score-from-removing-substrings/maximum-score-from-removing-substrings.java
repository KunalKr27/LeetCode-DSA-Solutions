public class Solution {
    public int maximumGain(String s, int x, int y) {
        if (x > y) return countScore(s, "ab", x, "ba", y);
        else return countScore(s, "ba", y, "ab", x);
    }

    private int countScore(String s, String first, int firstScore, String second, int secondScore) {
        StringBuilder sb = new StringBuilder();
        int score = 0;
        for (char c : s.toCharArray()) {
            sb.append(c);
            int len = sb.length();
            if (len >= 2 && sb.substring(len - 2).equals(first)) {
                sb.setLength(len - 2);
                score += firstScore;
            }
        }

        StringBuilder sb2 = new StringBuilder();
        for (char c : sb.toString().toCharArray()) {
            sb2.append(c);
            int len = sb2.length();
            if (len >= 2 && sb2.substring(len - 2).equals(second)) {
                sb2.setLength(len - 2);
                score += secondScore;
            }
        }
        return score;
    }
}
