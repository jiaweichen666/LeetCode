package p39CombinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //Arrays.sort(candidates);
        List<Integer> tmp = new ArrayList<>();
        List<List<Integer>> rtList = new ArrayList<>();
        backtrace(rtList,tmp,candidates,0,target);
        return rtList;
    }
    private void backtrace(List<List<Integer>> list,List<Integer> tmp, int[] nums,int start,int remain){
        if (remain < 0)
            return;
        else if (remain == 0)
            list.add(new ArrayList<>(tmp));
        for (int i = start; i < nums.length ; i++) {
            tmp.add(nums[i]);
            backtrace(list,tmp,nums,i,remain - nums[i]);
            tmp.remove(tmp.size() - 1);
        }
    }
}
