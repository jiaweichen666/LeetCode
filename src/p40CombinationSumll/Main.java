package p40CombinationSumll;
/**
 * Description:求固定sum的组合值，给定的数组中有重复值，但是结果中不能有重复值，一个数字只能被用一次
 * Tips：回溯法
 */

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2};
        Arrays.sort(nums);
        Solution solution = new Solution();
        System.out.println(solution.combinationSum2(nums,3));
    }
}
