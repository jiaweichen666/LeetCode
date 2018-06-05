package p49GroupAnagrams;
/**
 * Description:将有相同字母的单词分到一组
 * Tip：使用hashmap记录分组，将单词进行sort操作判断是否是具有相同的字母
 * 时间复杂度O(nklogk)
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hashMap = new HashMap<>();
        if(strs == null)
            return  new ArrayList<>();;
        for (String s:strs
             ) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String tmp = String.valueOf(chars);
            if (!hashMap.containsKey(tmp))
                hashMap.put(tmp,new ArrayList<>());
            hashMap.get(tmp).add(s);
        }
        return new ArrayList<>(hashMap.values());
    }
}
