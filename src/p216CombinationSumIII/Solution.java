package p216CombinationSumIII;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        int limit = 0;
        if (n <= 0 || k <= 0)
            return list;
        if (n > 9)
            limit = 9;
        else
            limit = n;
        List<Integer> tmp = new ArrayList<>(k);
        helper(k,limit,1,n,list,tmp,1);
        return list;
    }
    public void helper(int k,int n,int depth,int left,List<List<Integer>> list,List<Integer> tmp,int start){
        if (depth == k + 1 && left != 0)
            return;
        if (depth == k + 1 && left == 0) {
            list.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = start; i <= n; i++) {
            tmp.add(i);
            helper(k ,n,depth + 1,left - i,list,tmp,i + 1);
            tmp.remove(tmp.size() - 1);
        }
    }
}
