package p213HouseRobberII;

/**
 * Description:198题的改版，第一个房子和最后一个房子首位相连
 * Tip：通过分类讨论来将此问题改为198的子问题，讨论第一个房子是否被rob
 * 如果被rob，则最后一个不可以被rob，则最大为0~len-2子问题
 * 如果不被rob，则最后一个可以被rob，则最大问1~Len-1子问题
 * 取两个子问题的最大值。
 */
public class Solution {
    public int rob(int[] nums) {
        if (nums == null)
            return  -1;
        if (nums.length == 1)
            return nums[0];
        int res = Math.max(getMax(nums,0,nums.length - 2),getMax(nums,1,nums.length - 1));
        return res;
    }
    public int getMax(int[] nums,int start,int end){
        int preRob = 0;
        int preNotRob = 0;
        for (int i = start; i <= end; i++) {
            int tmp = preRob;
            preRob = preNotRob + nums[i];
            preNotRob = Math.max(preNotRob,tmp);
        }
        return Math.max(preNotRob,preRob);
    }
}
