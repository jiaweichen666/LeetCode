package p279PerfectSquares;

/**
 * Description:给定一个数，求出他包含的最少个数的平方数，如12，包含三个平方数4.返回3
 * Tip：DP解法，注意数组要初始化为int所能表示的最大值。递推公式。 tmp[i]  = Math.min(tmp[i],tmp[i - j * j] + 1)
 */
public class Solution {
    public int numSquares(int n) {
        if(n < 0)
            return -1;
        int [] tmp = new int[n + 1];
        for (int i = 1; i < tmp.length; i++) {
            tmp[i] = Integer.MAX_VALUE;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i ; j++) {
                tmp[i]  = Math.min(tmp[i],tmp[i - j * j] + 1);
            }
        }
        return tmp[n];
    }
}
