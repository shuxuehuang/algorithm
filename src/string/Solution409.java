package string;

public class Solution409 {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c]++;
        }
        int ans = 0;
        for (int i :count) {
            ans += i/2 *2;
            if (i % 2 == 1 && ans % 2 == 0){
                ans++;
            }
        }
    return ans;

    }
}
