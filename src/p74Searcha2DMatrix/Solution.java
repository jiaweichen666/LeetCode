package p74Searcha2DMatrix;

/**
 * Description:二维数组中找值
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0)
            return false;
        int rows = matrix.length - 1;
        int row = 0;
        int cols = matrix[0].length - 1;
        while (row <= rows && cols >= 0){
            if (matrix[row][cols] == target)
                return true;
            else if (matrix[row][cols] > target)
                cols--;
            else
                row++;
        }
        return false;
    }
}
