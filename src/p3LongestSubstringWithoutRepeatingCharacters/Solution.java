package p3LongestSubstringWithoutRepeatingCharacters;

class Solution {//暴力破解
    public int lengthOfLongestSubstring(String s) {
        if (s == null) return  0;
        int maxLength = 0;
        int length = 1;
        StringBuilder stringBuilder;
        for (int i = 0;i < s.length();i++) {
            stringBuilder = new StringBuilder(String.valueOf(s.charAt(i)));
            if (length > maxLength) maxLength = length;
            length = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (stringBuilder.toString().contains( String.valueOf(s.charAt(j)))) break;
                stringBuilder.append(s.charAt(j));
                length++;
            }
        }
        return maxLength;
    }
}
