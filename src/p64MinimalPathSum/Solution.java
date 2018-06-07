package p64MinimalPathSum;

/**
 * Description:给定Grip求从左上角到右下角的最短路径（此路径上的值的和加起来是所有路径中最小的）
 * Tips：动态规划法：
 * 声明辅助数组tmp。对于tmp的第一行和第一列上的值初始化为此格的值加上前一格的值
 * 对于其他行列上的值，选取其上方和左方较小的值加上此格子的值进行更新
 * 最后右下角的值即为最短路径
 */
public class Solution {
    public int minPathSum(int[][] grid) {
        if (grid == null)
            return 0;
        int[][] tmp = new int[grid.length][grid[0].length];
        tmp[0][0] = grid[0][0];
        for (int i = 1; i < grid[0].length; i++) {
            tmp[0][i] = grid[0][i] + tmp[0][i - 1];
        }
        for (int i = 1; i < grid.length; i++) {
            tmp[i][0] = grid[i][0] + tmp[i - 1][0];
        }
        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                if (tmp[i - 1][j] < tmp[i][j - 1] )
                    tmp[i][j] = tmp[i - 1][j] + grid[i][j];
                else
                    tmp[i][j] += tmp[i][j - 1] + grid[i][j];
            }

        }
        return tmp[grid.length - 1][grid[0].length - 1];
    }
}
