package p107BinaryTreeLevelOrderTraversalII;
/*Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        if (root == null) return list;
        BlockingQueue<TreeNode> queue = new ArrayBlockingQueue<TreeNode>(100);
        TreeNode node = root;
        TreeNode last = root;
        TreeNode nextLayerLast = root;
        list.add(0,new ArrayList<>());
        queue.add(node);
        while(!queue.isEmpty()){
            node = queue.poll();
            list.get(0).add(node.val);
            System.out.print(node.val+" ");
            if (node.left != null){
                queue.add(node.left);
                nextLayerLast = node.left;
            }
            if (node.right!=null) {
                queue.add(node.right);
                nextLayerLast = node.right;
            }
            if (node == last && !queue.isEmpty()){
                list.add(0,new ArrayList<>());
                last = nextLayerLast;//维持一个last引用来判断是否遍历到下一行。
                System.out.println();
            }
        }
      return list;
    }
}
