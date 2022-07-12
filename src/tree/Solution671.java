package tree;

public class Solution671 {
    int minValue;
    int secondValue;
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null){
            return -1;
        }
        minValue = root.val;
        secondValue = root.val;
        checkSecondValue(root);
        if (secondValue == minValue){
            return -1;
        }
        return secondValue;
    }
    public void checkSecondValue(TreeNode root){
        if (root == null){
            return;
        }
        //思考根节点做什么
        if (root.val <= minValue){
            minValue = root.val;
        }else {
            if (root.val < secondValue || secondValue == minValue ){
                secondValue = root.val;
            }
        }
        checkSecondValue(root.left);
        checkSecondValue(root.right);
    }

}
