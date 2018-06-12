package p114FlattenBinaryTreetoLinkedList;


import java.util.ArrayList;
import java.util.List;

/**
 * Description:将二叉树转为链表
 * Tip：分为两步第一步中序遍历二叉树并存储节点
 *      第二步根据中序遍历的结果建立链表
 */
public class Solution {
    public void flatten(TreeNode root) {
        if (root == null)
            return;
        List<TreeNode> list = new ArrayList<>();
        helper(root,list);
        TreeNode first = list.remove(0);
        TreeNode p = first;
        while (!list.isEmpty()){
            TreeNode next = list.remove(0);
            p.left = null;
            p.right = next;
            p = next;
        }
        p.right = p.left = null;
        root = first;
    }
    private void helper(TreeNode root,List<TreeNode> list){
        if (root == null)
            return;
        list.add(root);
        helper(root.left,list);
        helper(root.right,list);
    }
}
