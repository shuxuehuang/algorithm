package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Solution425 {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0){
            return 0;
        }
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int pos = points[0][1];
        int ans = 1;
        for (int[] ints : points) {
            if (ints[0] > pos){
                ans++;
                pos = ints[1];
            }
        }
        return ans;


    }
}
