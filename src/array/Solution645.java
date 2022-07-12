package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution645 {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
        }
        for (int i = 0; i < n; i++) {
            Integer count = map.get(i);
            if (count == 2){
                res[0] = i;
            }
            if (count == 0){
                res[1] = i;
            }
        }
        return res;
    }
}
