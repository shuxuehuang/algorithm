package tree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution437 {
    public int pathSum(TreeNode root, int targetSum) {
        //路径总和
        if (root == null){
            return 0;
        }
        int set = pathSum(root,targetSum);
        set += pathSum(root.right,targetSum);
        set += pathSum(root.left,targetSum);
        return set;


    }
    public int countPathSum(TreeNode root,int targetSum){
        //递归结束条件
        if (root == null){
            return 0;
        }
        //本层递归做什么
        int set = 0;
        if (root.val == targetSum){
            set++;
        }
        //每一层递归返回什么
        set += countPathSum(root.left,targetSum-root.val) + countPathSum(root.right,targetSum-root.val);
        return set;
    }
}
