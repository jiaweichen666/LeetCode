package p79WordSearch;

public class Main {
    public static void main(String[] args) {
        char[][] chars = {{'a','b','c','e'},{'s','f','c','s'},{'a','d','e','e'}};
        String s = "abcced";
        Solution solution = new Solution();
        System.out.println(solution.exist(chars,s));
    }
}
