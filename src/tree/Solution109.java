package tree;

import tree.ListNode;

public class Solution109 {
    public TreeNode sortedListToBST(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size ++;
            temp = temp.next;
        }
        temp = head;
        int[] nums = new int[size];
        size = 0;
        while(temp != null){
            nums[size] = temp.val;
            size++;
            temp = temp.next;
        }
        TreeNode root = helper(nums, 0, nums.length - 1);
        return root;
    }
    public TreeNode helper(int[] sums,int left,int right){
        if (left > right){
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(sums[mid]);
        root.left = helper(sums,left,mid - 1);
        root.right = helper(sums,mid + 1,right);
        return root;
    }
}
