package p112PathSum;

/**
 * Description:实现函数判断二叉树中是否有特定和的路径（到叶节点为止）
 * Tip：在前序遍历的过程中进行判断
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
       if (root == null)
           return false;
       if (root.left == null && root.right == null && sum - root.val == 0)
           return true;
       return hasPathSum(root.left,sum - root.val) || hasPathSum(root.right,sum - root.val);
    }
}
