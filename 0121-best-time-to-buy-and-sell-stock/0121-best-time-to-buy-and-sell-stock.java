class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        int maxProfit = 0;

        int bought = prices[0];
        for(int i= 1;i<n;i++){
            
            maxProfit = Math.max(maxProfit, prices[i]-bought);
            if(bought > prices[i]) bought = prices[i];
        }
        return maxProfit;
    }
}