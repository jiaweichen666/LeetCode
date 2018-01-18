package p101SymmetricTree;

import java.util.Stack;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root == null || isSameTree(root.left,root.right);
    }
    public boolean isSameTree(TreeNode left,TreeNode right){
        if (left == null && right == null) return  true;
        if (left ==null || right == null) return  false;
        if (left.val == right.val)
            return isSameTree(left.left,right.left)&&isSameTree(left.right,right.right);
        return false;
    }
    public void PreOrdertraversal(TreeNode root){
        if (root!= null){
            System.out.print(root.val+" ");
            PreOrdertraversal(root.left);
            PreOrdertraversal(root.right);
        }
    }
    public void InOrdertraversal(TreeNode root){
        if (root!= null){
            InOrdertraversal(root.left);
            System.out.print(root.val+" ");
            InOrdertraversal(root.right);
        }
    }
    public void SubOrdertraversal(TreeNode root){
        if (root!= null){
            SubOrdertraversal(root.left);
            SubOrdertraversal(root.right);
            System.out.print(root.val+" ");
        }
    }
    public  void PreOrderWithoutRecursive(TreeNode treeNode){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node  = treeNode;
        while(node!=null||!stack.empty()){
            while(node!=null){
                System.out.print(node.val+" ");//先输出中，在输出左
                stack.push(node);
                node = node.left;
            }
            if (!stack.empty()){
                node = stack.pop();//根据根节点找到右子节点，继续先序遍历。
                node = node.right;
            }
        }
    }
    public void InOrderWithoutRecursive(TreeNode treeNode){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = treeNode;
        while(node!= null || !stack.empty()){
            while(node!=null){
                stack.push(node);
                node = node.left;
            }
            if (!stack.empty()){
                node = stack.pop();
                System.out.print(node.val+" ");//先输出左，在出栈输出中
                node = node.right;//根据根节点找到右子节点进行中序遍历。
            }
        }
    }
}
