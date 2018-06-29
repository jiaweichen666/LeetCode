package p187RepeatedDNASequences;
/**
 * Description:给定一个字符串，试着找出其中出现了两次或者两次以上的10长度连续子序列。
 * Tip：从前向后遍历，对于每一个长度为10的子序列，检查是否能加入第一个set中，若加入失败说明已经不是第一次出现
 * 加入第二个set（第二个set是为了处理出现不止两次的子序列，用来对这种子序列去重）
 * 最后返回第二个set
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> list = new ArrayList<>();
        Set<String> seen = new HashSet<>();
        Set<String> seenTwiceOrMore = new HashSet<>();
        for (int i = 0; i + 9 < s.length() ; i++) {
            if (!seen.add(s.substring(i,i + 10)))
                seenTwiceOrMore.add(s.substring(i,i + 10));
        }
        list.addAll(seenTwiceOrMore);
        return list;
    }
}
