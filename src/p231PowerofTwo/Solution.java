package p231PowerofTwo;

/**
 * Description:给定一个数判断是不是2的n(0,1,2,3....)次方
 * Tip：若一个数是2的n次方，则这个数对应的二进制位只有一位为1其他都为0
 * 而 n - 1 则是把这个为1的一位变成了0，而这一位的右边都变成了1，把原来的数和减一后的数做&运算
 * 若这个数是2的n次方，则结果一定是0，若不是0，则这个数一定不是2的n次方。
 */
public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;
        /*while ( n != 1){
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }*/
        return (n &(n - 1)) == 0;
    }
}
