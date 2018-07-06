package p221MaximalSquare;
/**
 * Description:给定一个只有0和1的二维数组，求里面最大全1正方形的面积
 * Tip：申请m+1,n+1大小的二维数组，dp[i][j]代表了以此点为右下角的正方形的边长
 * 若nums对应位置上也为1，则dp这个位置上的值为左上左边上边这三个位置边长的最小加1，
 * 因为如果检查的三个位置上的值不一样，说明有一个边是缺了或者短了就构成不了正方形了。
 */
public class Solution {
    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] tmp = new int[m + 1][n + 1];
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <=n ; j++) {
                if (matrix[i - 1][j - 1] == '1'){
                    tmp[i][j] = Math.min(tmp[i - 1][j - 1],Math.min(tmp[i - 1][j],tmp[i][j - 1])) + 1;
                    max = Math.max(max,tmp[i][j]);
                }
            }
        }
        return max * max;
    }
}
