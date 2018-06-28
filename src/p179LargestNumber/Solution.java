package p179LargestNumber;
/**
 * Description：将给定数组排成最大的数
 * Tips：注意Arrays.sort方法在给定Compator的情况下只能排序包装类型的Integer数组
 * 若排序后的第一个数字是0则直接返回0
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    public String largestNumber(int[] nums) {
        if (nums == null)
            return null;
        Integer[] integers = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            integers[i] = new Integer(nums[i]);
        }
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                StringBuilder stringBuilder1 = new StringBuilder();
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder1.append(o1).append(o2);
                stringBuilder2.append(o2).append(o1);
                return stringBuilder2.toString().compareTo(stringBuilder1.toString());
            }
        };
        Arrays.sort(integers,comparator);
        StringBuilder stringBuilder = new StringBuilder();
        if (integers[0] == 0)
            return "0";
        for (int i = 0; i < integers.length; i++) {
            stringBuilder.append(integers[i]);
        }
        return stringBuilder.toString();
    }
}
