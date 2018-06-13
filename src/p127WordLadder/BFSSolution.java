package p127WordLadder;

import java.util.*;

/**
 *单向的BFS搜索， Time Limit Exceeded
 */
public class BFSSolution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord))
            return 0;
        List<String> queue = new ArrayList<>();
        HashMap<String,Boolean> isvisited = new HashMap<>();
        Iterator<String> iterator = wordList.listIterator();
        while (iterator.hasNext())
            isvisited.put(iterator.next(),false);
        int step = 0;
        queue.add(beginWord);
        while (!queue.isEmpty()){
            step++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String node = queue.remove(0);
                isvisited.put(node,true);
                char[] nodechar = node.toCharArray();
                for (int j = 0; j < beginWord.length(); j++) {
                    for (char k = 'a'; k <= 'z'; k++) {
                        char[] tmpchar = Arrays.copyOfRange(nodechar,0,nodechar.length);
                        tmpchar[j] = k ;
                        String tmpstr = String.valueOf(tmpchar);
                        if (tmpstr.equals(endWord))
                            return step + 1;
                        else if (wordList.contains(tmpstr) && !isvisited.get(tmpstr))
                            queue.add(tmpstr);
                    }
                }
            }
        }
        return 0;
    }
}
