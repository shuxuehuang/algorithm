package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution501 {
    List<Integer> answer = new ArrayList<>();
    int base,count,maxCount;
    public int[] findMode(TreeNode root) {
        dfs(root);
        int[] ints = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            ints[i] = answer.get(i);
        }
        return ints;
    }
    public void dfs(TreeNode root){
        if (root == null){
            return;
        }
        dfs(root.left);
        update(root.val);
        dfs(root.right);
    }
    public void update(int number){
        if (number == base){
            count++;
        }else {
            base = number;
            count = 1;
        }
        if (count == maxCount){
            answer.add(base);
        }
        if (count > maxCount){
            maxCount = count;
            answer.clear();
            answer.add(base);
        }

    }
}
