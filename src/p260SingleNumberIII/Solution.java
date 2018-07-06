package p260SingleNumberIII;

/**
 * Description:给定一个数组，其中有两个数字只出现了一次，其他数字都出现了两次。找出只出现了一次的两个数字。
 * Tip：先异或全部的数字得到一个结果，因为出现了一次的两个数字不一样，所以结果肯定不为0，也就是说结果中肯定有一位是1，找出
 * 最右边的为1的位数，然后取一个checknum，这个数只有这一位为1.用来将数组分成两份进行异或。最后异或得到的两个结果就是只出现了
 * 一次的两个数字。
 */
public class Solution {
    public int[] singleNumber(int[] nums) {
        int xorResult = 0;
        for (int i = 0; i < nums.length; i++) {
            xorResult ^= nums[i];
        }
        int index1 = 0;
        for (; index1 < 32; index1++) {
            if ((xorResult & 1) == 1){
                break;
            }
            xorResult >>= 1;
        }
        int checknum = 1;
        checknum = (checknum << index1);
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & checknum) == 0 )
                num1 ^= nums[i];
            else
                num2 ^= nums[i];
        }
        int [] result = {num1,num2};
        return result;
    }
}
