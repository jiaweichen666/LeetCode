package p80RemoveDuplicatesFromSortedArrayII;

/**
 * Description:原地去除排序过的数组中出现次数大于两次的数字
 * Tip：i < 2时按顺序写入，当i > 2 时，跟它前一个的前一个数字比较，因为数组是排序过的，如果是第三次出现或者第四次出现
 * 则一定不满足条件 nums[i] > nums[i - 2]
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null)
            return 0;
        int i = 0;
        for (int n:nums
             ) {
            if (i < 2 || n > nums[i - 2])
                nums[i++] = n;
        }
        return i;
    }
}
