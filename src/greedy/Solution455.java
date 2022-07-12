package greedy;

import java.util.Arrays;

public class Solution455 {
    public int findContentChildren(int[] g, int[] s) {
        int flag = 0;
        int num = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for (int i = 0; i < s.length; i++) {
            if (s[i] >= g[flag]){
                num++;
                flag++;
                if (flag == g.length - 1){
                    return g.length;
                }
            }
        }
        return num;
    }
}
