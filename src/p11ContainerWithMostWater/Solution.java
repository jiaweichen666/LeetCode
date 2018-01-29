package p11ContainerWithMostWater;
//https://leetcode.com/problems/container-with-most-water/description/
/*p指针指向数组头，q指针指向数组尾部，移动指向较短木板的那一个指针，因为木桶效应。
* 移动较长的那块模板的指针不可能让装的水变得更多。尝试移动指向较短的木板的那个指针，看是否能用有木板，能以
* 增加的长度，抵消减小的宽度，从而能更新最大装水量。*/
class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int len = height.length;
        int p = 0;
        int q = len - 1 ;
        int tmp = 0;
        while(p < q){
            if (height[p] < height[q]){
                tmp = (q - p) * height[p];
                p++;
            }else {
                tmp = (q - p) * height[q];
                q--;
            }
            if (tmp > maxWater)
                maxWater = tmp;

        }
        return maxWater;
    }
}