package p53MaximumSubarray;
/**
 * Description:求最大子序列和
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        int cursum = 0;
        int maxSum  = Integer.MIN_VALUE;
        if (nums == null)
            return cursum;
        for (int i = 0; i < nums.length; i++) {
            cursum = cursum + nums[i];
            if (cursum < nums[i])//如果加上当前数后的和比当前数还要小，则以当前数作为下一个开始
                cursum = nums[i];
            if (cursum > maxSum)
                maxSum = cursum;
        }
        return maxSum;
    }
}
