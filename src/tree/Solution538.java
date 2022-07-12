package tree;

public class Solution538 {
    int value = 0;
    public TreeNode convertBST(TreeNode root) {
        if (root == null){
            return null;
        }
        convertBST(root.right);
        value += root.val;
        root.val = value;
        convertBST(root.left);
        return root;
    }
}
