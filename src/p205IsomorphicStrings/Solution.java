package p205IsomorphicStrings;

/**
 * Description:判断两个字符串是否同构，
 * Example 1:

 Input: s = "egg", t = "add"
 Output: true
 Example 2:

 Input: s = "foo", t = "bar"
 Output: false
 Example 3:

 Input: s = "paper", t = "title"
 Output: true
 Tip：Java中char为16位范围为0~65535
 申请两个map，若对应字符的map值相同则更新，否则返回false
 */
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s== null || t == null || s.length() != t.length())
            return false;
        int[] m1 = new int[65535];
        int[] m2 = new int[65535];
        for (int i = 0; i < s.length(); i++) {
            if (m1[s.charAt(i)] != m2[t.charAt(i)])
                return false;
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
