package p91DecodeWays;

import java.math.BigDecimal;

public class Solution {
    public int numDecodings(String s) {
        if (s == null)
            return 0;
        if (s.startsWith("0"))
            //if (Integer.valueOf(s) == 0)
                return 0;
        return helper(s.toCharArray(),0);
    }
    private int helper(char[] chars,int start){
        if (start >= chars.length - 1)
            return 1;
        if (chars[start] == '0')
            start++;
        int flag = 0;
        if (start + 1 <= chars.length - 1){
            if (((chars[start] -'0') * 10 + chars[start + 1] - '0') >= 11 &&
                    ((chars[start] -'0') * 10 + chars[start + 1] - '0') <=26)
                        flag = 1;
        }
        if (flag == 1)
            return helper(chars,start + 1) + flag * helper(chars,start + 2);
        return helper(chars,start + 1);
    }
}
