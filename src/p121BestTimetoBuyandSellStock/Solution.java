package p121BestTimetoBuyandSellStock;

public class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null)
            return 0;
        int minBefore = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minBefore)
                minBefore = prices[i];
            if (prices[i] - minBefore > maxProfit)
                maxProfit = prices[i] - minBefore;
        }
        return maxProfit;
    }
}
