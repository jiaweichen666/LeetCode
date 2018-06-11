package p105ConstructBinaryTreefromPreorderandInorderTraversal;

/**
 * Description:根据前序序列和中序序列重构二叉树
 */
public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null)
            return null;
        return helper(preorder,0,preorder.length - 1,inorder,0,inorder.length - 1);
    }
    private TreeNode helper(int[] preorder,int prestart,int preend,int[] inorder,int instart,int inend){
        if (prestart > preend || instart > inend)
            return null;
        TreeNode root = new TreeNode(preorder[prestart]);
        int rootVal = preorder[prestart];
        int index = instart;
        for (; index <= inend; index++) {
            if (rootVal == inorder[index]) break;
        }
        int leftLen = index - instart;
        int rightLen = inend - index;
        if (leftLen > 0)
            root.left = helper(preorder,prestart + 1,prestart + leftLen,inorder,instart,index - 1);
        if (rightLen > 0)
            root.right = helper(preorder,prestart + leftLen + 1,preend,inorder,index + 1,inend);
        return root;
    }
}
