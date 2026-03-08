class Solution {
    public int kthElement(int a[], int b[], int k) {
      
        int n = a.length;
        int m = b.length;
        
        int temp[] = new int[n+m];
        int idx=0;
        
        for(int i=0; i<n; i++){
            temp[idx] = a[i];
            idx++;
        }
        for(int i = 0; i<m; i++){
            temp[idx++] = b[i];
        }
        
        Arrays.sort(temp);
        
        return temp[k-1];
    }
}
