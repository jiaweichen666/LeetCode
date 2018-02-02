package p17LetterCombinationsofaPhoneNumber;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    //这一题是抄的别人的啊。。。。。。。。。。。。
    /*这个方法竟然都能想得到*/
    /*1.根据分析得出的规律：最后返回的List中的String的位数和输入数字的位数是一样的。
    2.对于输入进来的数字，一位一位的进行分析，将ans中的所有String取出后加上当前分析位上对应的字母的每一位后再加入ans。
    3.ans是FIFO的。这样能保证在需要更新的ans元素能全部得到更新。
    * */
    public List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
        if(digits.isEmpty()) return ans;
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        for(int i =0; i<digits.length();i++){
            int x = Character.getNumericValue(digits.charAt(i));
            while(ans.peek().length()==i){
                String t = ans.remove();
                for(char s : mapping[x].toCharArray())
                    ans.add(t+s);
            }
        }
        return ans;
    }
}
