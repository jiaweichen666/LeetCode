package p45JumpGamell;
/*
//时间复杂度为o（n*n）的动态规划法，Timelimited
public class Solution {
    public int jump(int[] nums) {
        if (nums == null)
            return -1;
        int[] jumps = new int[nums.length];
        jumps[0] = 0;
        for (int i = 1; i < nums.length; i++) {
            int currenMinJump = Integer.MAX_VALUE;
                for (int j = 0; j < i; j++) {
                    if (nums[j] >= i - j) {
                        int jumpStepsFromj = jumps[j] + 1;
                        if (currenMinJump > jumpStepsFromj) {
                            currenMinJump = jumpStepsFromj;
                        }
                    }
                }
                jumps[i] = currenMinJump;
            }
        return jumps[nums.length - 1];
    }
}
*/
public class Solution {
    public int jump(int[] A) {
        int step_count = 0;
        int last_jump_max = 0;
        int current_jump_max = 0;
        for (int i = 0; i < A.length - 1; i++) {
            current_jump_max = Math.max(current_jump_max, i + A[i]);
            if (i == last_jump_max) {
                step_count++;
                last_jump_max = current_jump_max;
            }
        }
        return step_count;
    }
}