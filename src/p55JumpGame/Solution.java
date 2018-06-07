package p55JumpGame;

public class Solution {
    /*//递归方法：TimeLimited，74/75
    public boolean canJump(int[] nums) {
        if (nums == null)
            return false;
        else
            return helper(nums,0);
    }
    private boolean helper(int [] nums,int start){
        if (start + nums[start] >= nums.length - 1)
            return true;
        for (int i = 1; i <= nums[start]; i++) {
            if (helper(nums,start + i))
                return true;
        }
        return false;
    }*/
    //动态规划法，accepted，设f(x)表示从下标为x的元素出发是否能到达末端，从f（len - 1）开始从后往前求解
    public boolean canJump(int[] nums) {
        boolean[] flag = new boolean[nums.length];
        flag[nums.length - 1] = true;
        for (int i = nums.length - 2; i >= 0 ; i--) {
            for (int j = 1; j <= nums[i] ; j++) {
                if (flag[i + j]){
                    flag[i] = true;
                    break;
                }
            }
        }
        return flag[0];
    }
}
