package p134GasStation;

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (gas == null || cost == null)
            return -1;
        int startPoint = -1;
        int len = gas.length;
        for (int i = 0; i < gas.length; i++) {
            if (gas[i] >= cost[i]) {
                int currentGas = gas[i];
                startPoint = i;
                int prepoint = (startPoint - 1) >= 0 ? startPoint - 1 : len - 1;
                currentGas = currentGas - cost[startPoint] + gas[(startPoint + 1) % len];
                if (currentGas >= cost[(startPoint + 1) % len]) {
                    int j = (startPoint + 1) % len;
                    for (; j != prepoint; j = (j + 1) % len) {
                        if (currentGas < cost[j])
                            break;
                        currentGas = currentGas - cost[j] + gas[(j + 1) % len];
                    }
                    if (j == prepoint)
                      return startPoint;
                }
            }
        }
        return -1;
    }
}
