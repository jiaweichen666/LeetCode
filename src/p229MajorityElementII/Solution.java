package p229MajorityElementII;
/**
 * Description:找出给定数组中出现次数超过1/3的数字
 * Tip：由题意可以知道这种数字最多会有两个，使用Boyer-Moore Majority Vote algorithm算法的改版
 * 最后得到的两个数会有三种case：
 * 1.两个数都不符合题意
 * 2.只有一个数符合要求
 * 3.两个数都符合要求
 * 需要定义一个check函数
 * 需要注意的是，在遍历的过程中使用ifelse语句，只要有一个candidate等于当前数字，另外一个candidate就不需要做任何操作
 * 只有当前数字和两个candidate都不相等的时候，才对两个count进行更新。
 */

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if (nums == null || nums.length == 0)
            return list;
        int candidate1 = 0,candidate2 = 1,count1 = 0,count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (candidate1 == nums[i])
                count1++;
            else if (candidate2 == nums[i])
                count2++;
            else if (count1 == 0) {
                candidate1 = nums[i];
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = nums[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        if (isApearsMoreThanOneThird(nums,candidate1))
            list.add(candidate1);
        if (candidate2 != candidate1 && isApearsMoreThanOneThird(nums,candidate2))
            list.add(candidate2);
        return list;

    }
    private boolean isApearsMoreThanOneThird(int[] nums,int num){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (num == nums[i])
                count++;
        }
        return count > (nums.length/3);
    }
}
