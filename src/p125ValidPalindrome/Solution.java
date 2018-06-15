package p125ValidPalindrome;

/**
 * Description:判断是否是回文数，不区分大小写，不算非数字和字母类型的字符
 */
public class Solution {
    public boolean isPalindrome(String s) {
        if(s == null)
            return true;
        int start = 0;
        int end = s.length() - 1;
        while (start < end){
            if (!Character.isLetterOrDigit(s.charAt(start)))
                start++;
            else if (!Character.isLetterOrDigit(s.charAt(end)))
                end--;
            else  if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))
                return false;
            else {
                start++;
                end--;
            }
        }
        return true;
    }
}
