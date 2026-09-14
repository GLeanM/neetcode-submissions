class Solution {
    public int maxProfit(int[] prices) {
        // Min price
        // Profit 
        int minPrice = prices[0];
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            minPrice = Math.min(prices[i], minPrice);
            int sum = prices[i] - minPrice;
            if(sum > profit){
                profit = sum;
            }
        }
        return profit;
    }
}
