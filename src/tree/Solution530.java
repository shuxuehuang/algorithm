package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution530 {
    List<Integer> list = new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {

        inOrder(root);
        int minValue = list.get(1) - list.get(0);
        for (int i = 0; i < list.size() - 1; i++) {
            int temp = Math.abs(list.get(i) - list.get(i+1));
            if (temp < minValue){
                minValue = temp;
            }
        }
        return minValue;
    }
    public void inOrder(TreeNode root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }

}
