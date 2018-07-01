package p198HouseRobber;

/**
 * Description:给定一个array，假设你是一个职业盗贼，你可以抢劫一条街，但是不能连续抢劫两个house，求最多能抢多少钱
 * Tip：DP递推，维护四个变量，LastRobbed,LastNotRobbed,CurrentRobbed,CurrentNotRobbed;
 * 递推公式:currentRobbed = lastNotRobbed + nums[i];
           currentNotRobbed = Math.max(lastNotRobbed,lastRobbed);
 */
public class Solution {
    public int rob(int[] nums) {
        /*并不是这样简单。。。robber在奇数位时不rob，而在下一个偶数位rob
        int odd = 0;
        int even = 0;
        for (int i = 0; i < nums.length; i++) {
            if (((i + 1) & 1) == 1)
                odd += nums[i];
            else
                even += nums[i];
        }
        return Math.max(odd,even);*/
        if(nums == null)
            return -1;
        int lastRobbed = 0;
        int lastNotRobbed = 0;
        int currentRobbed = 0;
        int currentNotRobbed = 0;
        for (int i = 0; i < nums.length; i++) {
            currentRobbed = lastNotRobbed + nums[i];
            currentNotRobbed = Math.max(lastNotRobbed,lastRobbed);
            lastNotRobbed = currentNotRobbed;
            lastRobbed = currentRobbed;
        }
        return Math.max(currentNotRobbed,currentRobbed);
    }
}
