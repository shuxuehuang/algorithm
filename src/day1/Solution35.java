package day1;

public class Solution35 {
    public static void main(String[] args) {
        int[] nums = {1};
        int i = searchInsert(nums, 0);
        System.out.println(i);
    }
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while(left <= right){
            mid = (left + right) / 2;
            if(target == nums[mid]){
                return mid;
            }else if(target < nums[mid]){
                right = mid -1;
            }else {
                left = mid + 1;
            }
        }
        return Math.max(left,right);

    }
}
