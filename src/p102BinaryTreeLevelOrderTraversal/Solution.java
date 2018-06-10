package p102BinaryTreeLevelOrderTraversal;
import java.util.ArrayList;
import java.util.List;
/**
 Description:层序遍历二叉树，按照层换行
 Tip：通过size控制循环来换行
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<Integer> tmp = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        List<TreeNode> traceRout = new ArrayList<>();
        if (root == null)
            return list;
        traceRout.add(root);
        while (!traceRout.isEmpty()){
            int size = traceRout.size();
            for (int i = 0; i < size; i++) {
                TreeNode p = traceRout.remove(0);
                tmp.add(p.val);
                if (p.left != null)
                    traceRout.add(p.left);
                if (p.right != null)
                    traceRout.add(p.right);
            }
            list.add(new ArrayList<>(tmp));
            tmp.clear();
        }
        return list;
    }
}
