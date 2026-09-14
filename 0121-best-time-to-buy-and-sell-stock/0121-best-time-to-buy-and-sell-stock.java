class Solution {
    public int maxProfit(int[] prices) {
        
        int n= prices.length;
        int maxProfit = 0;
        int price = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            
            if(price > prices[i]) price = prices[i];
            else maxProfit = Math.max(prices[i] - price,maxProfit);
            
            
        }
        return maxProfit;
    }
}