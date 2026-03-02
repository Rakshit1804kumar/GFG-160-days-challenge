class Solution {
    public void sort012(int[] arr) {
       
        int n = arr.length;
        int a =0;
        int b = 0;
        int c = 0;
        
        for(int i =0; i<n; i++){
            if(arr[i] == 0){
                a++;
            }
            else if(arr[i] == 1){
                b++;
            }
            else{
                c++;
            }
        }
        int idx = 0;
        for(int i=0; i<a; i++){
            arr[idx++] = 0;
        }
        for(int i = 0 ;i<b; i++){
            arr[idx++] = 1;
        }
        for(int i = 0; i<c; i++){
            arr[idx++] = 2;
        }
    }
}
