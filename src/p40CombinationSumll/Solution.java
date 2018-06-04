package p40CombinationSumll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        if (candidates == null || target <= 0)
            return list;
        backtrace(list,new ArrayList<Integer>(),0,target,candidates);
        return list;
    }
    private void backtrace(List<List<Integer>> lists,List<Integer>tmp,int start,int remain,int []nums){
        if (remain < 0)
            return;
        if (remain == 0)
            lists.add(new ArrayList<>(tmp));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;
            tmp.add(nums[i]);
            backtrace(lists,tmp,i + 1,remain - nums[i],nums);
            tmp.remove(tmp.size() - 1);
        }
    }
}
