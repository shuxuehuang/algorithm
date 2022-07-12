package stack;

import java.util.Arrays;
import java.util.Stack;

public class Solution503 {
    public int[] nextGreaterElements(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length];
        Arrays.fill(ans,-1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < length * 2; i++) {
            int num = nums[i%length];
            while (!stack.empty() && num > nums[stack.peek()]){
                ans[stack.pop()] = num;
            }
            if (i < length){
                stack.push(i);
            }
        }
        return ans;
    }
}
