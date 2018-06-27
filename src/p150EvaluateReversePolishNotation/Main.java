package p150EvaluateReversePolishNotation;

public class Main {
    public static void main(String[] args) {
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        Solution solution = new Solution();
        System.out.println(solution.evalRPN(tokens));
    }
}
