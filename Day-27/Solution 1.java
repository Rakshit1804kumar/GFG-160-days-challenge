class Solution {
    public void mergeArrays(int a[], int b[]) {
        
        int n = a.length;
        int m = b.length;
        
        int temp[] = new int[n+m];
        int idx = 0;
        
        for(int i = 0; i<n;i++){
            temp[idx] = a[i];
            idx++;
        }
        for(int i = 0; i<m;i++){
            temp[idx] = b[i];
            idx++;
        }
        
        Arrays.sort(temp);
        int idxx = 0;
        for(int i = 0; i<n;i++){
            a[i] = temp[idxx];
            idxx++;
        }
        for(int i = 0; i<m; i++){
            b[i] = temp[idxx++];
        }
        
    }
}
