package p127WordLadder;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot","dot","dog","lot","log");
        BFSSolution solution = new BFSSolution();
        System.out.println(solution.ladderLength(beginWord,endWord,wordList));
    }
}
