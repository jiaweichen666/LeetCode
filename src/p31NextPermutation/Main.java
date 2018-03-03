package p31NextPermutation;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] nums = {1,2,7,4,3,1};
        solution.nextPermutation(nums);
        for (int a:nums
             ) {
            System.out.println(a);
        }
    }
}
