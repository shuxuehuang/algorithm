package tree;

public class Solution687 {
    int ans;
    public int longestUnivaluePath(TreeNode root) {
        if (root == null){
            return 0;
        }
        getMaxL(root,root.val);
        return ans;
    }
    public int getMaxL(TreeNode root,int val){
        if (root == null){
            return 0;
        }
        int left = getMaxL(root.left,root.val);
        int right = getMaxL(root.right,root.val);
        ans = Math.max(ans, left + right);
        if (root.val == val){
            return Math.max(left,right) + 1;
        }
        return 0;

    }

}
