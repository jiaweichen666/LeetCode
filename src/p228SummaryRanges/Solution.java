package p228SummaryRanges;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:Example 1:

 Input:  [0,1,2,4,5,7]
 Output: ["0->2","4->5","7"]
 Explanation: 0,1,2 form a continuous range; 4,5 form a continuous range.
 Example 2:

 Input:  [0,2,3,4,6,8,9]
 Output: ["0","2->4","6","8->9"]
 Explanation: 2,3,4 form a continuous range; 8,9 form a continuous range.
 Tip:O（n）时间复杂度算法如下。从连续子数字的第一个节点开始，找到最后一个节点，
 若最后一个节点和第一个节点一样，则直接add第一个节点
 若不一样，则需要add -> 和最后一个节点的值。
 */
public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums == null)
            return list;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            stringBuilder.append(start);
            while (i < nums.length - 1 && nums[i + 1] - nums[i] == 1 ){
                i++;
            }
            if (nums[i] == start)
                list.add(stringBuilder.toString());
            else {
                stringBuilder.append("->").append(nums[i]);
                list.add(stringBuilder.toString());
            }
            stringBuilder.delete(0,stringBuilder.length());
        }
        return list;
    }
}
