package p5LongestPalindromicSubstring;

public class Solution {//动态规划Timelimited
    public String longestPalindrome(String s) {
        int len = s.length();
        Boolean[][] matrix = new Boolean[len][len];
        int maxlen = 0;
        int startpoint = 0;
        int endpoint = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j <= i; j++) {
                if (i - j < 2) {
                    matrix[j][i] = s.charAt(j) == s.charAt(i);
                } else {
                    matrix[j][i] = s.charAt(j) == s.charAt(i) && matrix[j + 1][i - 1];
                }
                if (matrix[j][i] && (i - j + 1) > maxlen) {
                    maxlen = i - j + 1;
                    startpoint = j;
                }
            }
        }
        return s.substring(startpoint,maxlen + startpoint);
    }
}