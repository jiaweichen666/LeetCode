package p110BalancedBinaryTree;
class Solution {
    private static boolean isbalanced = true;
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        depth(root);
        return isbalanced;
    }
    private static int depth(TreeNode node){
        if (node == null)
            return  0;
        int left = depth(node.left);
        int right = depth(node.right);
        if (Math.abs(left - right ) > 1) isbalanced = false;
        return left > right ? left + 1 : right + 1;
    }
}
