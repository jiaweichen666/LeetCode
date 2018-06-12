package p120Triangle;
/**
 * Description：给定数字三角，找出从顶部到底部最短的一条路径
 * Tip：从底部到顶部计算，避免了从顶部到底部的过程中的重复计算
 * 使用DP，DP公式：minTotal[j] = Math.min(minTotal[j],minTotal[j + 1] ) + curRow.get(j);
 * https://leetcode.com/problems/triangle/discuss/38730/DP-Solution-for-Triangle
 */

import java.util.Iterator;
import java.util.List;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null)
            return 0;
        List<Integer> lastRow = triangle.get(triangle.size() - 1);
        int[] minTotal = new int[triangle.size()];
        Iterator<Integer> iterator = lastRow.listIterator();
        int t = 0;
        while (iterator.hasNext())
            minTotal[t++] = iterator.next();
        for (int i = triangle.size() - 2; i >=0 ; i--) {
            List<Integer> curRow = triangle.get(i);
            List<Integer> nextRow = triangle.get(i + 1);
            for (int j = 0; j < curRow.size(); j++) {
                minTotal[j] = Math.min(minTotal[j],minTotal[j + 1] ) + curRow.get(j);
            }
        }
        return minTotal[0];
    }
}
