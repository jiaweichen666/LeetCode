package p219ContainsDuplicateII;

import java.util.HashSet;
import java.util.Set;

/**
 * Description:给定数组和k，判断数组中是否存在两个相同的值并且其下标之差不超过k
 * Tip：设定大小为k + 1的滑动窗口，遍历数组，若i <= k则直接加入滑动窗口，若i > k,则删除
 * 滑动窗口最前面的值，即nums[i - k - 1],再加入set
 * 若加入失败这说明找到了。若遍历到最后都没有找到则说明不存在。
 */
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null)
            return false;
        Set<Integer> slideWindow = new HashSet<>(k + 1);
        for (int i = 0; i < nums.length; i++) {
            if (i > k)
                slideWindow.remove(nums[i - k - 1]);
            if (!slideWindow.add(nums[i]))
                return true;
        }
        return false;
    }
}
