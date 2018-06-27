package p150EvaluateReversePolishNotation;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
Description:倒置逆波兰式的计算
Tip：使用辅助栈。我的方法中正则判断是否为数字的时间复杂度较高，只击败了3%的代码。。。
如果使用if else直接判断是否是四个运算符会快很多。。
import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        int a,b;
		Stack<Integer> S = new Stack<Integer>();
		for (String s : tokens) {
			if(s.equals("+")) {
				S.add(S.pop()+S.pop());
			}
			else if(s.equals("/")) {
				b = S.pop();
				a = S.pop();
				S.add(a / b);
			}
			else if(s.equals("*")) {
				S.add(S.pop() * S.pop());
			}
			else if(s.equals("-")) {
				b = S.pop();
				a = S.pop();
				S.add(a - b);
			}
			else {
				S.add(Integer.parseInt(s));
			}
		}
		return S.pop();
	}
}
 */
public class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens == null)
            return -1;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (isNumber(tokens[i])){
                stack.push(Integer.valueOf(tokens[i]));
            }else {
                int b = stack.pop();
                int a = stack.pop();
                int c = 0;
                switch (tokens[i]) {
                    case "+":
                        c = a + b;
                        break;
                    case "-":
                        c = a - b;
                        break;
                    case "*":
                        c = a * b;
                        break;
                    case "/":
                        c = a / b;
                        break;
                }
                stack.push(c);
            }
        }
        return stack.pop();
    }
    private boolean isNumber(String str){
        Pattern pattern = Pattern.compile("-?[0-9]+$");
        Matcher isNum = pattern.matcher(str);
        if( !isNum.matches() ){
            return false;
        }
        return true;
    }
}
