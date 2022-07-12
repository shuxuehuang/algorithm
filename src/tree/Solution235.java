package tree;

public class Solution235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null){
            return null;
        }
        TreeNode ancestor = root;
        while(true){
            if (p.val < ancestor.val && q.val < ancestor.val){
                ancestor = ancestor.left;
            }else if (p.val > ancestor.val && q.val > ancestor.val){
                ancestor = ancestor.right;
            } else {
                break;
            }
        }
        return ancestor;

    }

}
