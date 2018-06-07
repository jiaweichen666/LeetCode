package p62UniquePaths;

/**
 * Description：机器人在00格子，有个n*m的棋盘，求到最右下角的格子有多少种走法
 * Tips：最基本的动态规划法
 * 假设matrix[i][j]为到下标为ij的格子的走法
 * 因为机器人只可能往下走或者说往右走，所有有matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1]
 * 对于最左边和最上边这一列和一行，全部初始化为1
 */
public class Solution {
    public int uniquePaths(int m, int n) {
    int[][] matrix = new int[n][m];
        for (int i = 0; i < m; i++) {
            matrix[0][i] = 1;
        }
        for (int i = 0; i < n; i++) {
            matrix[i][0] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1];
            }
        }
        return matrix[n - 1][m -1];
    }
}
