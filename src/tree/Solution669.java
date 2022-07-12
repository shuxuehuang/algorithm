package tree;

public class Solution669 {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        //修剪BST
        if (root == null){
            return null;
        }
        if (root.val > high){
            return trimBST(root.left,low,high);
        }
        if (root.val < low){
            return trimBST(root.right,low,high);
        }
        root.left = trimBST(root.left,low,high);
        root.right = trimBST(root.right,low,high);
        return root;
    }
}
