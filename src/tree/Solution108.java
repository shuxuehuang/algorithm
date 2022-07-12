package tree;

public class Solution108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        //构建二叉查找树
        TreeNode root = helper(nums, 0, nums.length - 1);
        return root;

    }
    public TreeNode helper(int[] nums,int left,int right){
        if (left > right){
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums,left,mid - 1);
        root.right = helper(nums,mid + 1,right);
        return root;
    }
}
