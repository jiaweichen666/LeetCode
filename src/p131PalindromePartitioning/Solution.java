package p131PalindromePartitioning;
/**
 * Description:给定String，把它分成由回文子串组成的list，返回所有的分法。
 */

import java.util.ArrayList;
import java.util.List;

public class Solution {//递归方案，高于15%的其他答案
    public List<List<String>> partition(String s) {
        List<List<String>> lists = new ArrayList<>();
        List<String> tmp = new ArrayList<>();
        if (s == null)
            return lists;
        helper(s,0,lists,tmp);
        return lists;
    }
    private void helper(String s,int start,List<List<String>> lists,List<String> tmp){
        if (start >= s.length())
            lists.add(new ArrayList<>(tmp));
        for (int i = start + 1; i <= s.length(); i++) {
            String sub = s.substring(start,i);
            if (isPalindrome(sub)) {
                tmp.add(sub);
                helper(s, i, lists, tmp);
                tmp.remove(tmp.size() - 1);
            }
        }
    }
    private boolean isPalindrome(String s){
        if (s == null)
            return false;
        char[] chars = s.toCharArray();
        int end = chars.length - 1;
        int start = 0;
        while (start < end){
            if (chars[start ++] != chars[end--])
                return false;
        }
        return true;
    }
}
