package p91DecodeWays;

public class Main {
    public static void main(String[] args) {
        String s = "100";
        Solution solution = new Solution();
        System.out.println(solution.numDecodings(s));
        IterationSolution iterationSolution = new IterationSolution();
        System.out.println(iterationSolution.numDecodings(s));
    }
}
