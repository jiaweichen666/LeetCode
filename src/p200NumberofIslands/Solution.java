package p200NumberofIslands;

/**
 * Description:假设二维数组中1代表陆地0代表水面。求这个数组中有多少个岛屿
 * Tip：在获得某个岛屿的某个元素后将所有这块岛屿的1都设为0，count++
 * 最后得到的就是岛屿的数量。
 */
public class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null)
            return 0;
        int m = grid.length;
        if (m == 0)
            return 0;
        int n = grid[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1'){
                    DFSTraveser(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    private void DFSTraveser(char[][] grid,int i,int j){
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != '1')
            return;
        grid[i][j] = '0';
        DFSTraveser(grid,i + 1,j);
        DFSTraveser(grid,i - 1,j);
        DFSTraveser(grid,i,j + 1);
        DFSTraveser(grid,i,j - 1);
    }
}
