package p230KthSmallestElementinaBST;
/**
 * Description:求BST的第k大的值
 * Tip：BST树的中序遍历的第k个值就是所求的值。
 */

import java.util.Stack;

public class Solution {
    int currentIndex = 0;
    Stack<TreeNode> stack = new Stack<>();
    int kthVal = 0;
    public int kthSmallest(TreeNode root, int k) {
        if (root == null || k <= 0)
            return -1;
        TreeNode p = root;
        while (p != null || !stack.isEmpty()){
            while (p != null){
                stack.push(p);
                p = p.left;
            }
            if (!stack.isEmpty()){
                p = stack.pop();
                currentIndex++;
                if (currentIndex == k){
                    kthVal = p.val;
                    break;
                }
                p = p.right;
            }
        }
        return kthVal;
    }
}
