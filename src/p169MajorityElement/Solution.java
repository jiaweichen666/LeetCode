package p169MajorityElement;

/**
 *
 */
public class Solution {
    /*//二分法超时
    public int majorityElement(int[] nums) {
        if (nums == null)
            return -1;
        int paviot = nums[0];
        int start = 0;
        int index = -1;
        int end = nums.length - 1;
        int mid = (start + end) >> 1;
        while (index != mid) {
            if (index > mid){
                start = 0;
                end = index - 1;
            }else if (index < mid){
                start = index + 1;
                end = nums.length - 1;
            }
            paviot = nums[start];
            while (start < end) {
                while (start < end && nums[end] >= paviot)
                    end--;
                nums[start] = nums[end];
                while (start < end && nums[start] <= paviot)
                    start++;
                nums[end] = nums[start];
            }
            nums[start] = paviot;
            index = start;
        }
        return nums[start];
    }*/
    public int majorityElement(int[] num) {

        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;

        }
        return major;
    }
}
