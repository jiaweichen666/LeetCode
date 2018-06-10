package p103BinaryTreeZigzagLevelOrderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> list = new ArrayList<>();
            List<Integer> tmp = new ArrayList<>();
            Stack<TreeNode> odd = new Stack<>();
            Stack<TreeNode> even = new Stack<>();
            if (root == null)
                return list;
            odd.push(root);
            int i = 1;
            while (!odd.isEmpty()|| !even.isEmpty()){
                int size = 0;
                TreeNode p = null;
                if ((i & 0x1) == 1){
                    size = odd.size();
                    for (int j = 0; j < size; j++) {
                        p = odd.pop();
                        tmp.add(p.val);
                        if (p.left != null)
                            even.push(p.left);
                        if (p.right != null)
                            even.push(p.right);
                    }
                    list.add(new ArrayList<>(tmp));
                    tmp.clear();
                    i++;
                }else {
                    size = even.size();
                    for (int j = 0; j < size; j++) {
                        p = even.pop();
                        tmp.add(p.val);
                        if (p.right != null)
                            odd.push(p.right);
                        if (p.left != null)
                            odd.push(p.left);
                    }
                    list.add(new ArrayList<>(tmp));
                    tmp.clear();
                    i++;
                }
            }
            return list;
        }
}
