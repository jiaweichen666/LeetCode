package p31NextPermutation;

class Solution {
    public void nextPermutation(int[] nums) {
        int i,j,len = nums.length;
        for( i = len - 2  ;i >= 0;i--){
            if (nums[i] < nums[i+1]){
                for ( j = len - 1;j > i;j-- ) {
                    if (nums[j] > nums[i]) {
                        break;
                    }
                }
                swap(i, j, nums);
                reverse(i + 1, nums.length - 1, nums);
                return;
            }
        }
        reverse(0,len - 1,nums);//如果没能找到相应的i说明是最后一个排列，全逆序改成全正序。
    }
    public void swap(int i,int j,int [] nums){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    public void reverse(int i,int j,int[] nums){
        while (i < j){
            swap(i++,j--,nums);
        }
    }
}
