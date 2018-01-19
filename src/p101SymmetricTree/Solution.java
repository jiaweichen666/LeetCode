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
            return isSameTree(left.left,right.right)&&isSameTree(left.right,right.left);//这边需要注意是递归的，最左结点对应最右
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
        if(treeNode == null ) return;
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
        if (treeNode == null) return;
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
    public void SubOrderWithoutRecursive(TreeNode treeNode){
        if (treeNode == null) return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = treeNode;
        TreeNode lastVisit = null;
            while(node!=null){//这段循环只在开始时循环一遍，和前序中序不一样
                stack.push(node);//node为null时不入栈
                node = node.left;
            }
            while(!stack.empty()){
                node = stack.peek();
                if (node.right == null || node.right == lastVisit){
                    System.out.print(node.val+" ");
                    node = stack.pop();
                    lastVisit = node;
                }else{//能走到这一步，说明if里面的条件都不满足，即右子树不为空且没有被访问过
                    node = node.right;
                    while (node!= null){
                        stack.push(node);
                        node = node.left;
                    }
                }
            }
        }

    }