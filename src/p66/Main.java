package p66;

public class Main {
    public static void main(String[] args) {
        int num[] = {9,9,9};
        int outnum[];
        Solution solution = new Solution();
        outnum = solution.plusOne(num);
        for (int s:outnum
             ) {
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
