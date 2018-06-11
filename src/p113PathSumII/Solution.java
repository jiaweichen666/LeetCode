package p113PathSumII;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        helper(root,sum,list,tmp);
        return list;
    }
    private List<List<Integer>> helper(TreeNode root,int remain,List<List<Integer>> list,List<Integer> tmp){
        if (root == null)
            return list;
        tmp.add(root.val);
        if (root.left == null && root.right == null && remain - root.val == 0){
            list.add(new ArrayList<>(tmp));
        }
        list = helper(root.left,remain - root.val,list,tmp);
        list = helper(root.right,remain - root.val,list,tmp);
        tmp.remove(tmp.size() - 1);
        return list;
    }
}
