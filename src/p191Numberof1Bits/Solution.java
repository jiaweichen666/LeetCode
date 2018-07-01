package p191Numberof1Bits;

/**
 * Description:给定一个整数判断其中有多少位是1
 * Tip：注意移位的时候应该使用>>>而不是>>，使用>>会超时
 * 因为对于负数来说使用>>的时候左边会补上1.导致无线循环（可以直接使用一个32次的循环解决）
 * 而使用>>>的时候，不管是正数还是负数左边直接补0
 */
public class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while ( n != 0){
            count += (n & 1);
            n = n >>> 1;
        }
        return count;
    }
}
