// 121. Best Time to Buy and Sell Stock I
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        
        int n = prices.length ; 
        for(int i = 0 ; i < n ; i++ ){
            minPrice = Math.min(minPrice , prices[i]);
            int profit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit , profit);
        }
        return maxProfit;
    }
}


// 122. Best Time to Buy and Sell Stock II
class Solution {
    public int maxProfit(int[] prices) {
        int n  = prices.length;
        int profit = 0 ;
        for(int i = 1 ; i < n ; i++){
            if(prices[i] > prices[i - 1]) profit += prices[i] - prices[i-1];
        }
        return profit;
    }
}