package p238ProductofArrayExceptSelf;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
       /* int product = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                product *= nums[i];
            else {
                product = 0;
                break;
            }
        }
        int [] res = new int[nums.length];
        if (product == 0)
            return res;
        else {

            for (int i = 0; i < nums.length; i++) {
                res[i] = product / nums[i];
            }
        }
        return res;*/
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }
}
