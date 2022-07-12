package tree;

import java.util.ArrayList;
import java.util.List;

public class Solution236 {
    TreeNode ans = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //找到二叉树的最近公共祖先
        dfs(root,p,q);
        return ans;

    }
    public boolean dfs(TreeNode root, TreeNode p, TreeNode q){
        if (root == null){
            return false;
        }
        boolean lSon = dfs(root.left, p, q);
        boolean rSon = dfs(root.right,p,q);
        if ((lSon && rSon) || ((root.val == p.val || root.val == q.val)) && (lSon || rSon)){
            ans =root;
        }
        return lSon || rSon || (root.val == p.val || root.val == q.val);
    }
}
