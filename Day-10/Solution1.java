class Solution {
    int maxSubarraySum(int[] arr) {
     
        int n = arr.length;
        int res = arr[0];
        
        for(int i=0;i<n;i++){
            int curr = 0;
            
            for(int j = i; j<n; j++){
                curr += arr[j];
                
                res = Math.max(res,curr);
            }
        }
        return res;
    }
}
