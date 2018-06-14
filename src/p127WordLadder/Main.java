package p127WordLadder;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot","dot","dog","lot","log","cog");
        BiDerectionSolution biDerectionSolution = new BiDerectionSolution();
        System.out.println(biDerectionSolution.ladderLength(beginWord,endWord,wordList));

    }
}
