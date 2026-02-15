class Solution {
    public int missingNumber(int[] arr) {
   
        Arrays.sort(arr);
        
        int n = arr.length;
        int res = 1;
        
        for(int i = 0; i<n; i++){
            if(arr[i] == res){
                res++;
            }
            else if(arr[i]>res){
                break;
            }
        }
        return res;
    }
}
