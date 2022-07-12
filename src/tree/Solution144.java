package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution144 {
    ArrayList<Integer> integers = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null){
            return integers;
        }
        integers.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return integers;
    }
    public List<Integer> preorderTraversal2(TreeNode root) {
       //非递归形式前序遍历二叉树，需要借助堆栈
        ArrayList<Integer> ret = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        if (root == null){
            return ret;
        }
        while(!stack.empty()){
            TreeNode now = stack.pop();
            ret.add(now.val);
            if (now.right != null){
                stack.push(now.right);
            }
            if (now.left != null){
                stack.push(now.left);
            }

        }
        return ret;
    }
}
