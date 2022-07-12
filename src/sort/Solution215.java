package sort;

import java.util.Arrays;

public class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        int length = nums.length;
        Arrays.sort(nums);
        return nums[length - k + 1];
    }
}
