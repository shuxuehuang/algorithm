package tree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null){
            return false;
        }
        Queue<TreeNode> treeNodes = new LinkedList<>();
        Queue<Integer> sums = new LinkedList<>();
        treeNodes.offer(root);
        sums.offer(root.val);
        while(!treeNodes.isEmpty()){
            TreeNode now = treeNodes.poll();
            Integer sum = sums.poll();
            if(now.left !=null){
                treeNodes.offer(now.left);
                sums.offer(sum+now.left.val);
            }
            if(now.right != null){
                treeNodes.offer(now.right);
                sums.offer(sum+now.right.val);
            }
            if(now.right == null && now.left == null){
                if(sum == targetSum){
                    return true;
                }
            }
        }
        return false;

    }


}
