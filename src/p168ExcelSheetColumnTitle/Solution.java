package p168ExcelSheetColumnTitle;

/**
 * Description:将给定数字转换为二十六进制。
 */
public class Solution {
    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
        while(n>0){
            n--;
            result.insert(0, (char)('A' + n % 26));
            n /= 26;
        }

        return result.toString();
    }
}