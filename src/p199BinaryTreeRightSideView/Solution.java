package p199BinaryTreeRightSideView;
/**
 * Description:找出二叉树的最右边框
 * Tip：层序遍历的改造，从右向左层序遍历。每一层的第一个节点加入返回list
 */

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        List<TreeNode> helper = new ArrayList<>();
        helper.add(root);
        while (!helper.isEmpty()){
            int size = helper.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = helper.remove(0);
                if (i == 0){
                    list.add(node.val);
                }
                if (node.right != null)
                    helper.add(node.right);
                if (node.left != null)
                    helper.add(node.left);
            }
        }
        return list;
    }
}
