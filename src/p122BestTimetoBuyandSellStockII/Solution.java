package p122BestTimetoBuyandSellStockII;

public class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        if (prices == null)
            return maxProfit;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxProfit += prices[i] - prices[i - 1];
        }
        return maxProfit;
    }
}