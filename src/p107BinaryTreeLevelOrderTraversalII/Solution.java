package p107BinaryTreeLevelOrderTraversalII;

import java.util.*;
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
                last = nextLayerLast;
                System.out.println();
            }
        }
      return list;
    }
}
