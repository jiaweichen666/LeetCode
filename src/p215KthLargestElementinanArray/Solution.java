package p215KthLargestElementinanArray;

/**
 * Description:TopK问题。O(N) best case / O(N^2) worst case running time + O(1) memory
 * Tip：采用快排一次划分方法或者采用小根堆。若当前堆中元素不足k则直接加入，若堆中已经有k个元素则与堆顶元素比较。
 * 如果小于堆顶则跳过，大于堆顶则替换掉堆顶元素调整小根堆，最后的堆顶元素就是topk
 */
public class Solution {
    public int findKthLargest(int[] nums, int k) {
        if (nums == null)
            return -1;
        int len = nums.length;
        int start = 0;
        int end = len - 1;
        int p = patition(nums,start,end);
        int target = len - k;
        while ( p != target){
            if (p > target)
                end = p - 1;
            else
                start = p + 1;
            p = patition(nums,start,end);
        }
        return nums[p];
    }
    private int patition(int[] nums,int start,int end){
        int first = start;
        int last = end;
        int pivot = nums[start];
        while (first < last){
            while (first < last && nums[last] >= pivot)
                last--;
            nums[first] = nums[last];
            while (first < last && nums[first] <= pivot)
                first++;
            nums[last] = nums[first];
        }
        nums[first] = pivot;
        return first;
    }
}
