class Solution {
    public int maxProfit(int prices[]) {
        // code here
        return helper(prices,0,prices.length-1);
    }
    
    public static int helper(int arr[], int start,int  end){
        
        if(end<=start){
            return 0;
        }
        int res = 0;
        
        for(int i = start; i<end; i++){
            for(int j = i+1; j<= end; j++){
                if(arr[j]>arr[i]){
                    int curr = arr[j] - arr[i]+ 
                    helper(arr,start,i-1) + helper(arr,j+1,end);
                    
                    res = Math.max(res,curr);
                }
            }
        }
        return res;
    }
}
