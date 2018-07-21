package p264UglyNumberII;

public class Solution {
    public int nthUglyNumber(int n) {
        int[] uglyNums = new int[n];
        if (n <= 0)
            return 0;
        else if (n == 1)
            return 1;
        uglyNums[0] = 1;
        int nextIndex = 1;
        int nextUgly2 = 0;
        int nextUgly3 = 0;
        int nextUgly5 = 0;
        while (nextIndex < n){
            int candidate = min(uglyNums[nextUgly2] * 2,uglyNums[nextUgly3] * 3,uglyNums[nextUgly5] * 5);
            uglyNums[nextIndex] = candidate;
            while (uglyNums[nextUgly2] * 2 <= candidate)
                nextUgly2++;
            while (uglyNums[nextUgly3] * 3 <= candidate)
                nextUgly3++;
            while (uglyNums[nextUgly5] * 5 <= candidate)
                nextUgly5++;
            nextIndex++;
        }
        return uglyNums[n - 1];
    }
    private int min(int a,int b,int c){
        return Math.min(Math.min(a,b),c);
    }
}
