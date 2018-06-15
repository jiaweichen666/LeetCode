package p128LongestConsecutiveSequence;
import java.util.HashSet;
import java.util.Set;

/**
 * Description:给定一组数字，查找出这组数字中最长的连续数字序列的长度
 * Tip:最优解时间复杂度O（n）,将这组数字存入hashset，之后遍历set中的每一个数字
 * 要是此数字是连续序列的第一个数字，则计算此连续序列有多长，在这个过程之中更新maxConsecutive，
 * 虽然有两层循环，但是while循环只遍历n个数字是线性的。所以最后的时间复杂度也是O(n)
 */
public class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null)
            return 0;
        Set<Integer> hasSet = new HashSet<>();
        for (int num:nums
             ) {
            hasSet.add(num);
        }
        int maxConsecutive = 0;
        for (int num:hasSet) {
            if (!hasSet.contains(num - 1)){
                int curConsecutive = 1;
                while (hasSet.contains(num + 1)){
                    curConsecutive++;
                    num++;
                }
                maxConsecutive = Math.max(curConsecutive,maxConsecutive);
            }
        }
        return maxConsecutive;
    }
}
