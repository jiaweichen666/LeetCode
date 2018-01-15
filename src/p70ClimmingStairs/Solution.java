package p70ClimmingStairs;
/*You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.*/
public class Solution {/*两步爬楼梯问题，采用递推法，从三级楼梯开始，每一级都是前两级爬法之和，依次递推。也可采用递归方法，代价过高*/
    public int climbStairs(int n) {
        int a = 1;
        int b = 2;
        for(int i = 0;i < n-1;i++){
            int temp = a;
            a = b;
            b = temp + a;
        }
        return a;

    }
}
