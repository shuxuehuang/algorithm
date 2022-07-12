package tree;

public class Solution543 {
    int ans;
    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        sumTreeNode(root);
        return ans-1;
    }
    public int sumTreeNode(TreeNode root){
        if(root == null){
            return 0;
        }else{
            int L = sumTreeNode(root.left);
            int R = sumTreeNode(root.right);
            ans = Math.max(L+R+1,ans);
            return Math.max(L,R) + 1;
        }
    }
}
