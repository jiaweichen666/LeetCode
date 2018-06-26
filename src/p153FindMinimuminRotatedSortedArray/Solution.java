package p153FindMinimuminRotatedSortedArray;

public class Solution {
    public int findMin(int[] nums) {
        if(nums == null)
            return -1;
        int start = 0;
        int end = nums.length - 1;
        while (start > end){
            int mid = (start + end) >> 1;
            if (nums[mid] < nums[end])
                end = mid - 1;
            else if (nums[mid] > nums[end])
                start = mid + 1;
        }
        return nums[start];
    }
}
