package p34SearchforaRange;

class Solution {
    public int findLeftMost(int[] nums,int target){
        int re = 0;
        int low = 0;
        int high = nums.length - 1;
        int mid  = (low + high) /2;
        while (low < high){
            if (nums[mid] == target || nums[mid] > target)
                high = mid;
            else
                low = mid + 1;
        }
        if (low == high)
            re = low;
        return  re;
    }
}
