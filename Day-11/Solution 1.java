class Solution {
    int maxProduct(int[] arr) {
 
        int n = arr.length;
        int maxprod = arr[0];
        
        for(int i=0; i<n ; i++){
            int mul =1 ;
            
            for(int j =i ; j<n ; j++){
                mul*= arr[j];
                
                maxprod = Math.max(mul,maxprod);
            }
        }
        return maxprod;
    }
}
