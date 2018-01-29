package p7ReverseInteger;

public class Solution {
    public int reverse(int x) {
        int reversedX = 0;
        int a = x;
        int b = 0;
        int preReversedX = 0;
        while ( a !=  0){
            b = a % 10;
            preReversedX = reversedX;
            reversedX = reversedX * 10 + b;
            if((reversedX - b)/10 != preReversedX)//此if语句用来判断是否有整数溢出
                return  0;
            a = a / 10;

        }
        return  reversedX;
    }
}
