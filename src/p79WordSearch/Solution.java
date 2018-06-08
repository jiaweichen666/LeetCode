package p79WordSearch;

/**
 * Description:找矩阵中是否存在特定的路径
 * Tips：回溯法，记得元素不可以重复使用需要一个isvisited数组记录元素是否被访问
 */
public class Solution {
    public boolean exist(char[][] board, String word) {
        if (board == null || word == null)
            return false;
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] isvisited = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == word.charAt(0)) {
                    boolean isexist = backtrace(isvisited,board, word.toCharArray(), rows, cols, i, j, 0);
                    if (isexist)
                        return isexist;
                }
            }
        }
        return false;
    }
    private boolean backtrace(boolean[][] isvisited,char[][] bord,char[] chars,int rows,int cols,int row,int col, int depth){
        if (depth >= chars.length)
            return true;
        else if (row >=0 && col >= 0 && row < rows && col < cols && isvisited[row][col] == false && bord[row][col] == chars[depth]){
            isvisited[row][col] = true;
            boolean isExist = backtrace(isvisited,bord,chars,rows,cols,row + 1,col,depth + 1)||
                              backtrace(isvisited,bord,chars,rows,cols,row - 1,col,depth + 1)||
                              backtrace(isvisited,bord,chars,rows,cols,row,col + 1,depth + 1)||
                              backtrace(isvisited,bord,chars,rows,cols,row,col - 1,depth + 1);
            if (!isExist) {
                isvisited[row][col] = false;
            }
            return isExist;
        }
        return false;
    }
}
