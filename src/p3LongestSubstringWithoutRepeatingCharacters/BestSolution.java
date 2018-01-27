package p3LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;

public class BestSolution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        //j指向子序列的开头，i指向子序列的结尾，一趟循环找出子序列的长度。时间复杂度O（n）
        //https://leetcode.com/problems/longest-substring-without-repeating-characters/discuss/1729?page=1
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
}
