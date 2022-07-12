package tree;

import java.util.HashSet;
import java.util.Set;

public class Solution653 {
    Set<Integer> set = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
       //利用hash表判断是否存在两个值相等

        if (root == null){
            return false;
        }
        if (set.contains(k-root.val)){
            return true;
        }
        set.add(root.val);
        boolean left = findTarget(root.left, k);
        boolean right = findTarget(root.right, k);
        return left || right;
    }
}
