package p129SumRoottoLeafNumbers;

/**
 * Description:给定二叉树，返回各条到叶节点的路径数字之和
 */
public class Solution {
    public int sumNumbers(TreeNode root) {
        if (root == null)
            return 0;
        return helper(root,0);
    }
    public int helper(TreeNode root,int sum){
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return sum * 10 + root.val;
        int leftSum = helper(root.left,sum * 10 + root.val);
        int rightSum = helper(root.right,sum * 10 + root.val);
        return leftSum + rightSum;
    }
}
