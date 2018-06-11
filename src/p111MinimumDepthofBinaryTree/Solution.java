package p111MinimumDepthofBinaryTree;
/**
 * Description:给定一棵二叉树，找出最低depth，即第一个叶子节点所在的depth
 * Tip：层序遍历，找到第一个叶子节点则返回当前层数。
 */

import java.util.ArrayList;
import java.util.List;
public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        int depth = 1;
        while (!list.isEmpty()){
            int size = list.size();
            for (int i = 0; i < size ; i++) {
                TreeNode p = list.remove(0);
                if (p.left != null)
                    list.add(p.left);
                if (p.right != null)
                    list.add(p.right);
                if (p.left == null && p.right == null)
                    return depth;
            }
            depth++;
        }
        return depth;
    }
}
/**leetCode上的精简解法，效率不一定比层序遍历高，因为需要遍历所有的节点
 * public static int minDepth(TreeNode root) {
 if (root == null)	return 0;
 if (root.left == null)	return minDepth(root.right) + 1;
 if (root.right == null) return minDepth(root.left) + 1;
 return Math.min(minDepth(root.left),minDepth(root.right)) + 1;
 }
 */
