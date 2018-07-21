package p283MoveZeroes;

/**
 * Description：给定一个数组，其中有若干个0，把0都移动到数组的末尾并保持数组中其他元素的相对位置不变
 * Tip：维护一个index若当前元素不为0则把当期元素复制到index下标处的位置。
 * index永远是小于等于当前遍历元素的下标的。若index在一次遍历后小于数组长度，则将此后开始的位置的所有元素都赋值为0
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 1)
            return;
        int index = 0;
        for (int num:nums
             ) {
            if (num != 0)
                nums[index++] = num;
        }
        while (index < nums.length)
            nums[index++] = 0;

    }
}
