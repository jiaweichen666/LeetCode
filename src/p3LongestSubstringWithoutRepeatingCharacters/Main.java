package p3LongestSubstringWithoutRepeatingCharacters;

public class Main {
    public static void main(String[] args) {
        //Solution solution = new Solution();
        BestSolution solution = new BestSolution();
        String string = new String("abcabcbb");
        System.out.println(solution.lengthOfLongestSubstring(string));
    }
}
