package p136SingleNumber;

public class Solution {
    public int singleNumber(int[] nums) {
        if (nums == null)
            return -1;
        int singleNum = 0;
        for (int i = 0; i < nums.length; i++) {
            singleNum = (singleNum ^ nums[i]);
        }
        return singleNum;
    }
}
