package sort;

public class Solution75 {
    public void sortColors(int[] nums) {
        int length = nums.length;
        int flag = 0;//标记已经交换过的位置
        int temp = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] == 0){
                temp = nums[i];
                nums[i] = nums[flag];
                nums[flag] = temp;
                flag++;
            }
        }
        for (int i = 0; i < length; i++) {
            if (nums[i] == 1){
                temp = nums[i];
                nums[i] = nums[flag];
                nums[flag] = temp;
                flag++;
            }
        }
        for (int i = 0; i < length; i++) {
            if (nums[i] == 2){
                temp = nums[i];
                nums[i] = nums[flag];
                nums[flag] = temp;
                flag++;
            }
        }
    }
}
