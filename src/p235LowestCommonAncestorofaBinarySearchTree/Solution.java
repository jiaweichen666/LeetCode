package p235LowestCommonAncestorofaBinarySearchTree;

/**
 * Description:给定BST和树中的两个节点，找出这两个节点的最低公共祖先
 * Tip：从root节点开始遍历，若两个节点的值都小于当前节点的值，则往左子树继续寻找
 * 若两个节点的值都大于当前节点的值，则往右子树继续寻找
 * 若当前节点的值在两个给定节点的值之间，则当前节点就是最低公共祖先。
 */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null)
            return null;
        TreeNode current = root;
        int leftVal = p.val;
        int rightVal = q.val;
        while (current != null){
            if (current.val >= leftVal && current.val <= rightVal || current.val >= rightVal && current.val <= leftVal)
                return current;
            else if (current.val > leftVal && current.val > rightVal)
                current = current.left;
            else if (current.val < leftVal && current.val < rightVal)
                current = current.right;
        }
        return null;
    }
}
