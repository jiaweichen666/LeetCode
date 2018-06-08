package p75SortColors;

/**
 * Description:排序0,1,2使用一遍扫描
 * Tips:将0全部排到左边将2全部排到右边
 */
public class Solution {
    public void swap(int[] nums,int i ,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    public void sortColors(int[] nums) {
        if (nums == null)
            return;
        int zero = 0;
        int two = nums.length - 1;
        for (int i = 0; i < nums.length ; i++) {
            while (nums[i] == 2 && i < two)
                swap(nums,i,two--);
            while (nums[i] == 0 && i > zero)
                swap(nums,i,zero++);
        }
    }
}
