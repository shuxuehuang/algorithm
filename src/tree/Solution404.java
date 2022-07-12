package tree;

public class Solution404 {
    int sum;
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null){
            return 0;
        }
        //根节点做什么？其余的交给遍历框架
        //根节点要把左叶子的值求和
        if (root.left != null && root.left.left == null && root.left.right == null){
            sum += root.left.val;
        }
        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);
        return sum;
    }
}
