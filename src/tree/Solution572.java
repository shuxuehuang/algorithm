package tree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        //判断一颗数是否是另一颗数的子树
        if (root==null || subRoot==null){
            return false;
        }
        Queue<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.offer(root);
        while(!treeNodes.isEmpty()){
            TreeNode now = treeNodes.poll();
            if(now.left != null){
                treeNodes.offer(now.left);
            }
            if(now.right != null){
                treeNodes.offer(now.right);
            }
            boolean isSub =  isSubtree2(now,subRoot);
            if(isSub == true){
                return true;
            }
        }

        return false;
        //3.返回值是什么


    }
    public boolean isSubtree2(TreeNode root,TreeNode subRoot){
        //1.找终止条件
        if (root==null || subRoot==null){
            return false;
        }
        if (root==null && subRoot == null){
            return true;
        }
        //2.本层递归做什么
        if (root.val == subRoot.val){
            boolean left = isSubtree2(root.left,subRoot.left);
            boolean right = isSubtree2(root.right,root.right);
            return (left && right);
        }
        return false;

    }
}
