package p39CombinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //Arrays.sort(candidates);
        List<Integer> tmp = new ArrayList<>();
        List<List<Integer>> rtList = new ArrayList<>();
        helper(candidates,0,target,tmp,rtList);
        return rtList;
    }
    public void helper(int[] nums, int start, int remain ,List<Integer> tmp, List<List<Integer>> rtList){
        if (remain < 0) return;
        else if (remain == 0){
            rtList.add(new ArrayList<>(tmp));
        }
        for (int i = start; i < nums.length; i++) {
            tmp.add(nums[i]);
            helper(nums,i,remain - nums[i],tmp,rtList);
            tmp.remove(tmp.size() - 1);
        }
    }
}
