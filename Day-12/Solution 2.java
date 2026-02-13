class Solution {
    public int maxCircularSum(int arr[]) {
      
        int n = arr.length;
        int totalSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        
        int currmax = 0;
        int currmin = 0;
        
        for(int i = 0; i<n; i++){
            totalSum += arr[i];
            
            currmax += arr[i];
            currmin += arr[i];
            
            maxSum = Math.max(maxSum,currmax);
            if(currmax<0) currmax = 0;
            
            minSum = Math.min(minSum, currmin);
            if(currmin>0 ) currmin = 0;
            
        }
        if(maxSum<0) return maxSum;
        
        return Math.max (maxSum, totalSum-minSum);
    }
}
