package n2evaluateReversePolishNotation;
/**
 * Description:求逆波兰表达式的值
 * Tip：使用辅助站，遍历字符串数组，如果是数组则压栈，不是数字则从栈中取出两个数字求职再压回栈中
 */

import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (isNum(tokens[i])){
                stack.push(Integer.valueOf(tokens[i]));
            }else {
                int a = stack.pop();
                int b = stack.pop();
                int value = 0;
                switch (tokens[i]){
                    case "+" :
                        value = b + a;
                        break;
                    case "-":
                        value = b - a;
                        break;
                    case  "*":
                        value = b * a;
                        break;
                    case  "/":
                        value = b / a;
                        break;
                    default:
                        break;
                }
                stack.push(value);
            }
        }
        int val = stack.pop();
        if (stack.isEmpty())
            return val;
        return -1;
    }
    public boolean isNum(String s){
        if (!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/"))
            return true;
        return false;
    }
}