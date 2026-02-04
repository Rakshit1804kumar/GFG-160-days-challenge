class Solution {
    public int maxProfit(int prices[]) {
   
        int n = prices.length;
        int lmin = prices[0];
        int lmax = prices[0];
        int res =0;
        
        int i=0;
        
        while(i<n-1){
            
            // find local minimum
            while(i<n-1  &&  prices[i]>=prices[i+1]){
                i++;
            }
            lmin = prices[i];
            
            // find local maximum
            while(i<n-1 && prices[i]<= prices[i+1]){
                i++;
            }
            lmax = prices[i];
            
            res += (lmax-lmin);
        }
        return res;
    }
    
    
}
