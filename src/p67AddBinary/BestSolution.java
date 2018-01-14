package p67AddBinary;
/*
* Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".

*/
public class BestSolution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() -1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) sum += b.charAt(j--) - '0';
            if (i >= 0) sum += a.charAt(i--) - '0';
            sb.append(sum % 2);//看是否有进位
            carry = sum / 2;//计算进位数
        }
        if (carry != 0) sb.append(carry);//如果一位还有进位则加一位
        return sb.reverse().toString();//因为append总是在最后所以需要翻转
    }
}