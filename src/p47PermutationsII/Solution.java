package p47PermutationsII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description：有重复数字的全排列
 */
public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backtrace(list,new ArrayList<Integer>(),nums,used);
        return list;

    }
    private void backtrace(List<List<Integer>> lists,List<Integer> tmpList,int[] nums,boolean[] used){
        if (tmpList.size() == nums.length)
            lists.add(new ArrayList<>(tmpList));
        else {
            for (int i = 0; i < nums.length; i++) {
                if (used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
                used[i] = true;
                tmpList.add(nums[i]);
                backtrace(lists,tmpList,nums,used);
                used[i] = false;
                tmpList.remove(tmpList.size() - 1);
            }
        }
    }
}
