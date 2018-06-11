package p106ConstructBinaryTreefromInorderandPostorderTraversal;

/**
 * Description:根据后序序列和中序序列重构二叉树
 */
public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null)
            return null;
        return helper(inorder,0,inorder.length - 1,postorder,0,postorder.length - 1);
    }
    private TreeNode helper(int[] inorder,int instart,int inend,int[] postorder,int poststart,int postend){
        if (instart > inend || poststart > postend)
            return null;
        TreeNode root = new TreeNode(postorder[postend]);
        int rootVal = postorder[postend];
        int index = instart;
        for (; index <= inend ; index++) {
            if (inorder[index] == rootVal) break;
        }
        int leftLen = index - instart;
        int rightLen = inend - index;
        if (leftLen > 0)
            root.left = helper(inorder,instart,index - 1,postorder,poststart,poststart + leftLen - 1);
        if (rightLen > 0)
            root.right = helper(inorder,index + 1,inend,postorder,poststart + leftLen,postend - 1);
        return  root;
    }
}
