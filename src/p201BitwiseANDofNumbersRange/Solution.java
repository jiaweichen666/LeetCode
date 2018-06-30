package p201BitwiseANDofNumbersRange;

/**
 * Description:求在m~n范围内数字的按位与的结果
 * Tips:求m与n的最长相等子前缀。
 */
public class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int count = 0;
        while ( m != n){
            m >>= 1;
            n >>= 1;
            count++;
        }
        return m << count;
    }
}
