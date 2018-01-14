package p58;
/*Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

Example:

Input: "Hello World"
Output: 5*/
import java.util.StringTokenizer;

class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        String temp = "";
        if(s.contains(" ")||s.length()>0){
            StringTokenizer stringTokenizer = new StringTokenizer(s);
            while(stringTokenizer.hasMoreElements()){
                temp = (String)stringTokenizer.nextElement();
            }
            length = temp.length();
        }
        return  length;
    }
}