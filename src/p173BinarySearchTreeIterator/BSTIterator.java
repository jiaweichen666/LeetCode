package p173BinarySearchTreeIterator;
/*Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.

Calling next() will return the next smallest number in the BST.

Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.
 */
import java.util.Stack;

public class BSTIterator {
    //全部遍历一遍二叉树时间复杂度太高
    /*ArrayList<Integer> list = new ArrayList<>();
    public BSTIterator(TreeNode root) {
        inorderTraverse(root);
    }

    *//** @return whether we have a next smallest number *//*
    public boolean hasNext() {
        return !list.isEmpty();
    }

    *//** @return the next smallest number *//*
    public int next() {
        return list.remove(0);
    }
    private void inorderTraverse(TreeNode treeNode){
        if (treeNode == null)
            return;
        inorderTraverse(treeNode.left);
        list.add(treeNode.val);
        inorderTraverse(treeNode.right);
    }*/
            //这种方式也是利用二叉树中序遍历的思想，先走到root的最左节点。
            //然后每弹出一个节点，走到其右子树上做同样的操作，无需遍历整个二叉树效率会略高。
    Stack<TreeNode> stack = new Stack<>();
    public BSTIterator(TreeNode root) {
        addAll(root);
    }
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode nextNode = stack.pop();
        addAll(nextNode.right);
        return nextNode.val;
    }
    public void addAll(TreeNode node){
        TreeNode p = node;
        while (p != null){
            stack.push(p);
            p = p.left;
        }
    }
}
