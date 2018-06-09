package p88MergeSortedArray;

/**
 * Description:给定两个排序过的数组，假设第一个数组空间足够，将第二个数组的值注入到第一个数组，保持第一个数组值有序
 * Tip：第一想法使用一个第一个数组的辅助复制数组，两个数组从头到尾遍历类似于归并排序的merge过程，空间复杂度O(n)
 * 第二想法两个数组都从后往前遍历，大的值写入第一个数组的末端。这样就不会覆盖掉未check的值，降低了空间复杂度
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0)
            return;
        m--;
        n--;
        int i = nums1.length - 1;
        while (m >= 0 || n >=0){
            if (m < 0){
                while (n >= 0){
                    nums1[i--] = nums2[n--];
                }
            }else if (n < 0){
                while (m >= 0){
                    nums1[i--] = nums1[m--];
                }
            }else if (nums1[m] >= nums2[n]){
                nums1[i--] = nums1[m--];
            }else {
                nums1[i--] = nums2[n--];
            }
        }
    }
}
