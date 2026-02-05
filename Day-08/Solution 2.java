class Solution {
    public int maxProfit(int[] prices) {
     
        int n = prices.length;
        int res = 0 ;
        int minstock = prices[0];
        
        for(int i = 0; i<n;i++){
             minstock = Math.min(prices[i],minstock);
             
             res = Math.max(res,prices[i]-minstock);
        }
        return res;
    }
}
