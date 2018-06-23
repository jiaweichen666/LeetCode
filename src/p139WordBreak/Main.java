package p139WordBreak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s = "aaaaaaa";
        List<String> dict = Arrays.asList("aaaa","aaa");
        Solution solution = new Solution();
        System.out.println(solution.wordBreak(s,dict));
    }
}
