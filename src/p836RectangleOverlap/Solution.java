package p836RectangleOverlap;

/**
 * Solution：判断两个矩形是否有重叠区域。
 * Tip:参见223题的解法
 */
public class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
            if (rec1 == null || rec2 == null || rec1.length != 4 || rec2.length != 4)
                return false;
            int left = Math.max(rec1[0],rec2[0]);
            int right = Math.max(Math.min(rec2[2],rec1[2]),left);
            int bottom = Math.max(rec1[1],rec2[1]);
            int top = Math.max(Math.min(rec2[3],rec1[3]),bottom);
            return !((right - left) * (top - bottom) == 0);
        }
}
