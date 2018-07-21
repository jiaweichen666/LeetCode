package p153FindMinimuminRotatedSortedArray;

public class Solution {
    //剑指offer的解法
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
       if(nums == null)
           return -1;
       else if (nums[start] < nums[end])
           return nums[start];
       else if (nums[start] == nums[end])
           return findMinIteraly(nums);
       while (end - start != 1){
           int mid = (start + end) >> 1;
           if (nums[mid] >= nums[start])
               start = mid;
           else if (nums[mid] <= nums[end])
               end = mid;
       }
       return nums[end];
    }
    private int findMinIteraly(int[] nums){
        int min = nums[0];
        for (int i = 1; i < nums.length ; i++) {
            if (nums[i] < min)
                min = nums[i];
        }
        return min;
    }
}
