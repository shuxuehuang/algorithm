package day1;

public class Solution704 {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int search = search(nums, 2);
        System.out.println(search);
    }
    //二分查找
    public static int search(int[] nums, int target) {
        return binarySearch(nums,0,nums.length-1,target);
    }
    public static int binarySearch(int[] nums,int left,int right,int target){
        if(left > right){
            return -1;
        }
        int mid = (left + right) / 2;
        if(target == nums[mid]){
            return mid;
        }
        if(target < nums[mid]){
            return binarySearch(nums,left,mid-1,target);
        }else {
            return binarySearch(nums,mid+1,right,target);
        }
    }

}
