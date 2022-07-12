package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution637 {
    public List<Double> averageOfLevels(TreeNode root) {

        // 求二叉树每一层的平均值
        ArrayList<Double> avgS = new ArrayList<>();
        Queue<TreeNode> treeNodes = new LinkedList<>();
        if (root == null){
            return avgS;
        }
        treeNodes.offer(root);
        while (!treeNodes.isEmpty()){
            int cnt = treeNodes.size();//当层节点个数
            double sum = 0;
            for (int i = 0; i < cnt; i++) {
                TreeNode now = treeNodes.poll();
                sum += now.val;
                if (now.left != null){
                    treeNodes.offer(now.left);
                }
                if (now.right != null){
                    treeNodes.offer(now.right);
                }
            }
            double avg = sum / cnt;
            avgS.add(avg);
        }
        return avgS;

    }
}
