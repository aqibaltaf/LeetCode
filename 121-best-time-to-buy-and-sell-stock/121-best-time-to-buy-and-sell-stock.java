class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0 , buy_price = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (buy_price > prices[i]) {
                buy_price = prices[i];
            } else if (prices[i] - buy_price > profit) {
                profit = prices[i] - buy_price;
            }
        }

        return profit;
        
    }
}