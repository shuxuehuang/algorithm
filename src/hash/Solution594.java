package hash;

import java.util.HashMap;

public class Solution594 {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> cnt = new HashMap<>();
        int res = 0;
        for (Integer num : nums) {
            cnt.put(num,cnt.getOrDefault(num,0) + 1);
        }
        for (Integer key : cnt.keySet()) {
            if (cnt.containsKey(key + 1)){
                res = Math.max(res,cnt.get(key) + cnt.get(key + 1));
            }

        }
        return res;

    }
}
