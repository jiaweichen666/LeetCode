package p134GasStation;

public class Main {
    public static void main(String[] args) {
        int[] gas = {3,3,4};
        int[] cost = {3,4,4};
        Solution solution = new Solution();
        System.out.println(solution.canCompleteCircuit(gas,cost));
    }
}
