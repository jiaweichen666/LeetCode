package p22GenerateParentheses;

import java.util.ArrayList;
import java.util.List;

public class Solution {//没想到，过两天再来写
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        backtrack(list, "", 0, 0, n);
        return list;
    }
    public void backtrack(List<String> list,String string,int begin,int end,int max){
        if (string.length() == max*2){//长度够了就添加
            list.add(string);
            return;
        }
        if (begin < max){
            backtrack(list,string+"(",begin+1,end,max);
        }
        if (end < begin){
            backtrack(list,string+")",begin,end+1,max);
        }
    }
}