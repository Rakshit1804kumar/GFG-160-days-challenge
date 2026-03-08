class Solution {
    public void mergeArrays(int a[], int b[]) {
  
        int  i = a.length-1; 
        int j=0;
        
        while(i>=0 && j<b.length){
            if(a[i] > b[j]){
                int temp = b[j];
                b[j] = a[i];
                a[i] = temp;
                i--;
                j++;
            }else{
                i--;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
