package p144BinaryTreePreorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            if (root == null)
                return list;
            helper(root,list);
            return list;
        }
        public void helper(TreeNode treeNode,List<Integer> list){
            if (treeNode == null)
                return;
            list.add(treeNode.val);
            helper(treeNode.left,list);
            helper(treeNode.right,list);
        }
    }
