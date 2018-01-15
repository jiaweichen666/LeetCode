package p69sqrtx;
/*Implement int sqrt(int x).
Compute and return the square root of x.
x is guaranteed to be a non-negative integer.
Example 1:
Input: 4
Output: 2
Example 2:
Input: 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we want to return an integer, the decimal part will be truncat*/
public class Solution {//采用牛顿迭代法求解
    public int mySqrt(int x) {
        double x1 = 1;
        double x2 = 0;
        while(true){
            x2 = x1-(x1*x1-x)/(2*x1);
            if(Math.abs(x1-x2)<0.000001)
                break;
            x1 = x2;
        }
        return new Double(x2).intValue();

    }
}
