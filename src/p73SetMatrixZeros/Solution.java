package p73SetMatrixZeros;

/**
 * Description:Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.

 Example 1:

 Input:
 [
 [1,1,1],
 [1,0,1],
 [1,1,1]
 ]
 Output:
 [
 [1,0,1],
 [0,0,0],
 [1,0,1]
 ]
 Tips:
 若某行或者某列中存在0，则将此行或者此列的第一个元素值设为0，对于第0行和第0列来说，第0行第0个值代表第0行中是否有0
 使用col0变量来代表第0列中是否有0值，第一个循环从上到下从左到右扫描，第二个循环从下到上从右到左扫描
 */
public class Solution {
    public void setZeroes(int[][] matrix) {
        if(matrix == null)
            return;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int col0 = -1;
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0)
                col0 = 0;
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0){
                    matrix[0][j] = matrix[i][0] = 0;
                }
            }
        }
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 1 ; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
            if (col0 == 0)
                matrix[i][0] = 0;
        }
    }
}
