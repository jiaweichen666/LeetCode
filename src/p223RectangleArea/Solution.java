package p223RectangleArea;

/**
 * Description:求两个矩形出去重叠部分之后的面积
 * Tip:求出四个变量left，right，top，bottom就能求出重叠部分的面积
 */
public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int left = Math.max(A,E);
        int right = Math.max(Math.min(C,G),left);
        int bottom = Math.max(B,F);
        int top = Math.max(Math.min(D,H),bottom);
        return (C - A) * (D - B) - (right - left) * (top - bottom) + (G - E) * (H - F);
    }
}
