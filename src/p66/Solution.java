package p66;
/*Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

You may assume the integer do not contain any leading zero, except the number 0 itself.

The digits are stored such that the most significant digit is at the head of the list.*/
/*如果不进位，加1后即返回；如果进位，此位为0，前一位做同样的判断；若都需要进位，则所有位都为0，加第一位为1*/
class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len-1;i>=0 ;i--){
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int returnDigits[] = new int[len+1];
        returnDigits[0] = 1;
        return  returnDigits;
    }
}