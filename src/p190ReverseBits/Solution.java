package p190ReverseBits;

/**
 * Description:给定一个无符号整数，按位翻转他的位
 * Input: 43261596
 Output: 964176192
 Explanation: 43261596 represented in binary as 00000010100101000001111010011100,
 return 964176192 represented in binary as 00111001011110000010100101000000.
 Tip：按位判断n最后一位是不是1.然后加到result上，result进行左移
 重复以上过程。注意第32次不需要左移。
 */
public class Solution {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result += (n & 1);
            n = n >>> 1;
            if (i != 31)
                result = result << 1;
        }
        return result;
    }
}
/**
 * 最佳解法：
 * class Solution {
 public:
 uint32_t reverseBits(uint32_t n) {
 n = (n >> 16) | (n << 16);
 n = ((n & 0xff00ff00) >> 8) | ((n & 0x00ff00ff) << 8);
 n = ((n & 0xf0f0f0f0) >> 4) | ((n & 0x0f0f0f0f) << 4);
 n = ((n & 0xcccccccc) >> 2) | ((n & 0x33333333) << 2);
 n = ((n & 0xaaaaaaaa) >> 1) | ((n & 0x55555555) << 1);
 return n;
 }
 };
 for 8 bit binary number abcdefgh, the process is as follow:

 abcdefgh -> efghabcd -> ghefcdab -> hgfedcba
 **/