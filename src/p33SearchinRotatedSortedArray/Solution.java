package p33SearchinRotatedSortedArray;

class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int m = nums.length - 1;
        int min = findMin(nums);
        int low = target > nums[m] ? 0 : min;
        int high = target > nums[m] ? min - 1 : m;
        while (low <= high){
            int mid = (low + high)/2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
    public int findMin(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        int mid;
        while(start < end){
            mid = start + (end - start)/2;
            if (nums[mid] > nums[end])
                start = mid + 1;
            else
                end = mid;
        }
        return  start;
    }
}
