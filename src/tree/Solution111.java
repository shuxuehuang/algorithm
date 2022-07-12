package tree;

public class Solution111 {
    public int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if (root.left == null || root.right == null){
            return left + right + 1;
        }
        return 1 + Math.min(left,right);

    }
}
