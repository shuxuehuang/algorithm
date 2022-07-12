package greedy;

public class Solution665 {
    public boolean checkPossibility(int[] nums) {
        if (nums.length <= 1){
            return true;
        }
        int flag = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]){
                if (i == 0){
                    nums[i] = nums[i+1] - 1;
                }else {
                    if ((nums[i + 1] - 1) < nums[i - 1]){
                        nums[i + 1] = nums[i] + 1;
                    }else {
                        nums[i] = nums[i+1] - 1;
                    }
                }
                flag ++;

            }
        }
        return flag <= 1;
    }
}
