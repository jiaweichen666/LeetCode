package n2evaluateReversePolishNotation;

public class Main {
    public static void main(String[] args) {
        String[] rpn = {"4", "13", "5", "/", "+"};
        Solution solution = new Solution();
        System.out.println(solution.evalRPN(rpn));
    }
}
