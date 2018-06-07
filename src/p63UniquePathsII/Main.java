package p63UniquePathsII;

public class Main {
    public static void main(String[] args) {
        int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
        Solution solution = new Solution();
        System.out.println(solution.uniquePathsWithObstacles(obstacleGrid));
    }
}
