package tree;

public class Solution230 {
    int index = 1;
    int res = 0;
    public int kthSmallest(TreeNode root, int k) {
        //找到BST第k大的值
        if (root == null){
            return 0;
        }
        inorderTraversal(root,k);
        return res;
    }
    public void inorderTraversal(TreeNode root,int k){
        if (root == null){
            return;
        }
        inorderTraversal(root.left,k);
        inorderTraversal(root.right,k);
        if (index == k){
            res = root.val;
        }
        index++;
    }
}
