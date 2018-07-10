package p268MissingNumber;

public class Solution {
    public int missingNumber(int[] nums) {
        if (nums == null)
            return -1;
        int suma = ((nums.length) * (nums.length + 1))/2;
        int sumb = 0;
        for (int i = 0; i < nums.length; i++) {
            sumb += nums[i];
        }
        return suma - sumb;
    }
}
