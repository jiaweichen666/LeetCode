package p63UniquePathsII;

/**
 * Description:求在有障碍的棋盘的左上角到右下角一共有多少条路径
 * Tip：使用动态规划
 * 若左上角就有障碍则直接返回0
 * 设置辅助数组tmp，对于tmp的第一行和第一列，若当前obstacleGrid对应位置不为1且他的上一个tmp元素不为0
 *（即若当前元素的为第一行中的元素，他的左边tmp值为0时，此格不可达设为0,
 * 列中的赋初值方式同理），
 * 则设为1
 * 否则设为0
 * 在求tmp[i][j]时，若obstacleGrip[i][j]==1则代表此格有障碍不可达，tmp设为0
 * 否则tmp为其左边元素值加上上边的元素值
 */

/**
 * Easiest solution:
 * public int uniquePathsWithObstacles(int[][] obstacleGrid) {
 *int width = obstacleGrid[0].length;
 *int[] dp = new int[width];
 *dp[0] = 1;
 *for (int[] row : obstacleGrid) {
 *for (int j = 0; j < width; j++) {
 *if (row[j] == 1)
 *dp[j] = 0;
 *else if (j > 0)
 *dp[j] += dp[j - 1];
 *}
 *}
 *return dp[width - 1];
 *}
 */
public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null || obstacleGrid[0][0] == 1)
            return 0;
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] tmp = new int[m][n];
        tmp[0][0] = 1;
        for (int i = 1; i < m; i++) {
            if (obstacleGrid[i][0] != 1 && tmp[i - 1][0] != 0)
                tmp[i][0] = 1;
            else
                tmp[i][0] = 0;
        }
        for (int i = 1; i < n; i++) {
            if (obstacleGrid[0][i] != 1 && tmp[0][i - 1] != 0)
                tmp[0][i] = 1;
            else
                tmp[0][i] = 0;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1)
                    tmp[i][j] = 0;
                else
                    tmp[i][j] = tmp[i - 1][j] + tmp[i][j - 1];
            }

        }
        return tmp[m - 1][n - 1];
    }
}
