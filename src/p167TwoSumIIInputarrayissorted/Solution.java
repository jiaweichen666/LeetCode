package p167TwoSumIIInputarrayissorted;

/**
 * Description:给定指定升序数组。判断数组中是否存在两个值加起来等于指定target。每个元素只可以使用一次
 * Tip：一个指针指向数组头一个指向数组尾部，向中间靠拢寻找。
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null)
            return null;
        int[] result = new int[2];
        int start = 0;
        int end = numbers.length - 1;
        while (start < end && numbers[start] + numbers[end] != target){
            if (numbers[start] + numbers[end] > target)
                end--;
            else if (numbers[start] + numbers[end] < target)
                start++;
        }
        if (start >= end)
            return result;
        else if (numbers[start] + numbers[end] == target){
            result[0] = start + 1;
            result[1] = end + 1;
        }
        return result;
    }
}
