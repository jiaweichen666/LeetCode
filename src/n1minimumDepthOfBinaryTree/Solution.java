package n1minimumDepthOfBinaryTree;
/**
 * Description:求树的最浅深度
 * Tip：层序遍历，找到第一个叶节点就返回
 */

import java.util.LinkedList;
import java.util.Stack;

public class Solution {
    public int run(TreeNode root){
        if (root == null)
            return 0;
        return helper(root);
    }
    public int helper(TreeNode root){
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        TreeNode right = root;
        TreeNode p = root;
        linkedList.addLast(root);
        int depth = 1;
        while (!linkedList.isEmpty()){
            p = linkedList.removeFirst();
            if (isLeaf(p))
                return depth;
            if (p.left != null)
                linkedList.addLast(p.left);
            if (p.right != null)
                linkedList.addLast(p.right);
            if (p == right){
                if (p.right != null)
                    right = p.right;
                else
                    right = p.left;
                depth++;
            }
        }
        return 0;
    }
    public boolean isLeaf(TreeNode treeNode){
        if (treeNode.left ==null && treeNode.right ==null)
            return true;
        return false;
    }
}
