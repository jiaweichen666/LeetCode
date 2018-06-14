package p127WordLadder;
/**
 * Description:给定beginWord和EndWord，和wordList，每次beginword只能变换一个字符，求wordlist里面是否存在从beginword到endword的变化路径
 * Tip：采用BFS的解法，有一点bruteForce的味道。beginword通过遍历每一个位置替换字符看是否在wordList中，endWord做相同的工作，如果在
 * 中间相遇则说明路径存在，set1和set2有任何一个为空则不存在路径
 */

import java.util.*;

public class BiDerectionSolution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int wordLen = beginWord.length();
        if(!wordList.contains(endWord))
            return 0;
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        HashSet<String> visited = new HashSet<>();
        set1.add(beginWord);
        set2.add(endWord);
        visited.add(beginWord);
        visited.add(endWord);
        int step = 0;
        while (!set1.isEmpty() || !set2.isEmpty()){
                Set<String> tmpset = set1;
                set1 = set2;
                set2 = tmpset;
            step++;
            int size = set1.size();
                Set<String> tmpSet = new HashSet<>();
                for(String tmpString:set1){
                    char[] tmpChar = tmpString.toCharArray();
                    for (int j = 0; j < wordLen; j++) {
                        char charOld = tmpChar[j];
                        for (char k = 'a'; k <='z' ; k++) {
                            tmpChar[j] = k;
                            String copyString = String.valueOf(tmpChar);
                            if (set2.contains(copyString))
                                return step + 1;
                            else if (wordList.contains(copyString) && !visited.contains(copyString)) {
                                tmpSet.add(copyString);
                                visited.add(copyString);
                            }
                          tmpChar[j] = charOld;
                        }
                    }
                }
                set1 = tmpSet;
        }
        return 0;
    }
}
