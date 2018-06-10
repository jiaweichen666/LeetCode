package p94BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        if (root == null)
            return list;
        while (!stack.isEmpty() || p != null){
            while (p != null){
                stack.push(p);
                p = p.left;
            }
            if (!stack.isEmpty()){
                p = stack.pop();
                list.add(p.val);
                p = p.right;
            }
        }
        return list;
    }
}
