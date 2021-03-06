package p108ConvertSortedArraytoBinarySearchTree;
/*Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.


Example:

Given the sorted array: [-10,-3,0,5,9],

One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:

      0
     / \
   -3   9
   /   /
 -10  5*/
import java.util.Arrays;

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        int len = nums.length;
        TreeNode root  = new TreeNode(nums[len/2]);
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, len/2));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, len/2 + 1, len));
        return root;
    }
}