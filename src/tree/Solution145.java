package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Solution145 {
    List<Integer> ret = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        //后续遍历二叉树
        if (root == null){
            return ret;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        ret.add(root.val);
        return ret;
    }
    public List<Integer> postorderTraversal2(TreeNode root) {
       //非递归后续遍历二叉树
        ArrayList<Integer> ret = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null){
            return ret;
        }
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode now = stack.pop();
            ret.add(now.val);
            if (now.left != null){
                stack.push(now.left);
            }
            if (now.right != null){
                stack.push(now.right);
            }
        }
        Collections.reverse(ret);
        return ret;
    }
}
