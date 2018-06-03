package p78Subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description:不带重复数字的数组求子集
 * TIps：回溯法
 */
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        backtrace(list,new ArrayList<Integer>(),nums,0);
        return list;

    }
    public void backtrace(List<List<Integer>> lists,List<Integer> tmpList,int[] nums,int start){
        lists.add(new ArrayList<>(tmpList));
        for (int i = start; i < nums.length; i++) {
            tmpList.add(nums[i]);
            backtrace(lists,tmpList,nums,i + 1);
            tmpList.remove(tmpList.size() - 1);
        }
    }
}