package p81SearchinRotatedSortedArrayII;

/**
 * Description：求在有重复元素的排序旋转数组中是否存在指定的元素
 * Tip：二分查找
 */
public class Solution {
    public boolean search(int[] nums, int target) {
        if (nums == null)
            return false;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = ((start + end) >> 1);
            //找到直接返回
            if (nums[mid] == target)
                return true;
            //中间数定位在排序数组中（即前一半）
            if (nums[mid] > nums[start]){
                //目标数定位在排序数组中（即前一半）
                if (target >= nums[start] && target < nums[mid])
                    end = mid - 1;
                //去后一半中查找
                else
                    start = mid + 1;
                //中间数定位在旋转数组中（即后一半）
            }else if (nums[mid] < nums[start]) {
                //目标数定位在旋转数组中（即后一半）
                if (target > nums[mid] && target <= nums[end])
                    start = mid + 1;
                else
                //去前一半中寻找
                    end = mid - 1;
            }else {
                //因为num[mid] != target && num[mid] != num[start]
                //只能推断出num[start] != target,只能start++.
                //对应于在11111111中寻找2的情况，最差的时间复杂度为O(n)
                start++;
            }
        }
        return false;
    }
}
