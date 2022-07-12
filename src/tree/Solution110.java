package tree;



public class Solution110 {
    public boolean isBalanced(TreeNode root) {
       if (root == null){
           return true;
       }else {
           return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.right) && isBalanced(root.left);
       }
    }
    public int height(TreeNode root){
        if (root == null){
            return 0;
        }else {
            return Math.max(height(root.left),height(root.right)) + 1;
        }
    }
}