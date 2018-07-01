package p189RotateArray;

/**
 * Description:翻转数组
 * Caution：要对k做预处理。k %= nums.length;
 */
public class Solution {
    public void rotate(int[] nums, int k) {
        if (nums == null || k <= 0)
            return;
        k %= nums.length;
            helper(nums, 0, nums.length - 1);
            helper(nums, 0, k - 1);
            helper(nums, k, nums.length - 1);
    }
    public void helper(int[] nums,int start,int end){
        while (start < end){
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
}
