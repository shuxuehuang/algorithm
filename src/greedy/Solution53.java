package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Solution53 {
    public int maxSubArray(int[] nums) {
        int pre = 0;
        int maxNum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            pre = Math.max(nums[i], pre + nums[i]);
            maxNum = Math.max(maxNum, pre);
        }
        return maxNum;

    }
}
