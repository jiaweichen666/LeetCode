package p236LowestCommonAncestorofaBinaryTree;
/**
 * Description：给定一个二叉树和两个节点，找出这两个节点的最低公共祖先。
 * Tip:用两个list存储从根节点到两个node的路径
 * 然后同时从list的头部开始遍历，最后一个val值相等的node就是最低公共祖先。
 */

import java.util.ArrayList;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> list1 = new ArrayList<>();
        ArrayList<TreeNode> list2 = new ArrayList<>();
        findPathOfNode(root,p,list1,new ArrayList<>());
        findPathOfNode(root,q,list2,new ArrayList<>());
        TreeNode res = null;
        while (!list1.isEmpty() && !list2.isEmpty() && list1.get(0).val == list2.get(0).val){
            res = list1.remove(0);
            list2.remove(0);
        }
        return res;
    }
    public void findPathOfNode(TreeNode root,TreeNode p,ArrayList<TreeNode> path,ArrayList<TreeNode> tmp){
        if (root == null)
            return;
        else if (root.val == p.val) {
            tmp.add(root);
            path.addAll(tmp);
            return;
        }
        tmp.add(root);
        findPathOfNode(root.left,p,path,tmp);
        findPathOfNode(root.right,p,path,tmp);
        tmp.remove(tmp.size() - 1);
    }
}
