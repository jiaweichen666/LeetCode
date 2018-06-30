package p171ExcelSheetColumnNumber;

/**
 * Description:Given a column title as appear in an Excel sheet, return its corresponding column number.
 * A -> 1
 B -> 2
 C -> 3
 ...
 Z -> 26
 AA -> 27
 AB -> 28
 Tip:其实就是将26进制转为十进制的问题。
 */
public class Solution {
    public int titleToNumber(String s) {
        if (s == null)
            return 0;
        int len = s.length();
        int pow = len - 1;
        int num = 0;
        for (int i = 0; i < len; i++) {
            num += (s.charAt(i) - 64) * Math.pow(26,pow - i);
        }
        return num;
    }
}
