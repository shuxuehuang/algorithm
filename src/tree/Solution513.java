package tree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution513 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(2);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(3);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        int bottomLeftValue = findBottomLeftValue(treeNode);
        System.out.println(bottomLeftValue);
    }
    public static int findBottomLeftValue(TreeNode root) {
        //找到二叉树左下脚的值
        int leftValue = 0;

        Queue<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.offer(root);
        while(!treeNodes.isEmpty()){
            int cnt = treeNodes.size();
            boolean flag = false;
            for (int i = 0; i < cnt; i++) {
                TreeNode now = treeNodes.poll();
                if (!flag){
                    leftValue = now.val;
                    flag = true;
                }
                if (now.left != null){
                    treeNodes.offer(now.left);
                }
                if (now.right != null){
                    treeNodes.offer(now.right);
                }
            }
        }
        return leftValue;
    }
}
