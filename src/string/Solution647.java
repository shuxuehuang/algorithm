package string;

public class Solution647 {
    public int countSubstrings(String s) {
        //动态规划法
        Boolean[][] dp = new Boolean[s.length()][s.length()];
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                if (s.charAt(j) == s.charAt(i) && (i - j < 2 || dp[j + 1][i - 1])){
                    dp[j][i] = true;
                    ans++;
                }
            }
        }
        return ans;
    }
    class Solution {
        public int countSubstrings(String s) {
            // 动态规划法
            boolean[][] dp = new boolean[s.length()][s.length()];
            int ans = 0;

            for (int j = 0; j < s.length(); j++) {
                for (int i = 0; i <= j; i++) {
                    if (s.charAt(i) == s.charAt(j) && (j - i < 2 || dp[i + 1][j - 1])) {
                        dp[i][j] = true;
                        ans++;
                    }
                }
            }

            return ans;
        }
    }
}
