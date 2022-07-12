package greedy;

public class Solution392 {
    public boolean isSubsequence(String s, String t) {
        char[] chars = s.toCharArray();
        int flag = 0;
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = flag; j < t.length(); j++) {
                if (chars[i] == t.charAt(j)){
                    flag = j;
                    count++;
                    break;
                }
            }
        }
        return count == chars.length;
    }
}
