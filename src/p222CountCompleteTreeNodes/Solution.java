package p222CountCompleteTreeNodes;

class Solution {
    public int countNodes(TreeNode root) {
        int h = height(root);
        return h == -1 ? 0 : height(root.right) == h - 1 ? (1 << h) + countNodes(root.right) : countNodes(root.left) + (1 << (h - 1));
    }
    public int height(TreeNode root){
        return root == null ? -1 : 1 + height(root.left);
    }
}