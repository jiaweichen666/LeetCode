package p137SingleNumberII;

/**
 * Description:一个数组中只有一个数字出现了一遍其他都出现了三遍，找到出现了一次的那个数字
 * Tip：将所有的数字的按位加起来，int一共32位，凡是某位上不能被3整除说明这是只出现一次的数字对应为1的位。
 */
public class Solution {
    public int singleNumber(int[] nums) {
        if (nums == null)
            return -1;
        int[] digits = new int[32];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for (int j = 31; j >= 0 ; j--) {
                if ((num & 1) == 1)
                    digits[j]++;
                num = num >> 1;
            }
        }
        int sigle = 0;
        for (int i = 0; i <= 31 ; i++) {
            sigle = sigle << 1;
            sigle += digits[i] % 3;
        }
        return sigle;
    }
}
