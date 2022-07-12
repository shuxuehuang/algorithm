package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        //非递归实现二叉树的中序遍历
        ArrayList<Integer> ret = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null){
            return ret;
        }
        TreeNode cur = root;
        while (cur != null || !stack.empty()){
            while (cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode pop = stack.pop();
            ret.add(pop.val);
            cur = pop.right;

        }
        return ret;
    }
}
