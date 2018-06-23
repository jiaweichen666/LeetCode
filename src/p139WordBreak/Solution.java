package p139WordBreak;

import java.util.List;

/**
 * Description:
 * TIp：递归法，超时
 */
public class Solution {
   /* public boolean wordBreak(String s, List<String> wordDict) {
        if (s == null || wordDict == null)
            return false;
        return helper(s,0,wordDict);
    }
    public boolean helper(String s,int start,List<String> wordDict){
        if (start >= s.length())
            return false;
        for (int i = start + 1; i <= s.length() ; i++) {
            if (wordDict.contains(s.substring(start,i))){
                if (i == s.length())
                    return true;
                if (helper(s,i,wordDict))
                    return true;
            }
        }
        return false;
    }*/

    public boolean wordBreak(String s, List<String> wordDict) {
        if (s == null || wordDict == null)
            return false;
        int len = s.length();
        boolean[] tmp = new boolean[len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j <= i ; j++) {
                if (wordDict.contains(s.substring(j,i + 1)) && (j == 0 || tmp[j - 1])) {
                    tmp[i] = true;
                    break;
                }
            }
        }
        return tmp[len - 1];
    }
}
