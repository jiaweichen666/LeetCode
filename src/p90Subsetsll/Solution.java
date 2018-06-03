package p90Subsetsll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description:带重复数字的数组求子集
 * Tips：回溯法
 */
public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        backtrace(list,new ArrayList<Integer>(),nums,0);
        return list;
    }
    public void backtrace(List<List<Integer>> lists,List<Integer> tmplist,int[] nums,int start){
        lists.add(new ArrayList<>(tmplist));
        for (int i = start; i < nums.length ; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;//满足此条件则说明num[i]对应的数字已经被考虑过
            tmplist.add(nums[i]);
            backtrace(lists,tmplist,nums,i + 1);
            tmplist.remove(tmplist.size() - 1);
        }

    }
}
