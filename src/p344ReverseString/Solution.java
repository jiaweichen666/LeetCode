package p344ReverseString;

public class Solution {
    public String reverseString(String s) {
        if (s == null)
            return s;
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start < end){
            char tmp = chars[start];
            chars[start] = chars[end];
            chars[end] = tmp;
            start++;
            end--;
        }
        return String.valueOf(chars);
    }
}
