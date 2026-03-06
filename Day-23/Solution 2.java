class Solution {
    static int inversionCount(int arr[]) {
  
        int n = arr.length-1;
        return mergesort(arr,0,n);
    }
    static int mergesort(int arr[], int left, int right){
        int count = 0;
        
        if(left<right){
            int mid = (left+right)/2;
            
            int countleft = mergesort(arr,left,mid);
            int countright = mergesort(arr,mid+1,right);
            int countinversion = merge(arr,left,mid,right);
            
            count = countleft + countright + countinversion;
        }
        return count;
    }
    static int merge(int arr[], int left, int mid, int right){
        int n1 = mid -left +1;
        int n2 = right - mid;
        
        int leftarr[] = new int[n1];
        int rightarr[] = new int[n2];
        
        for(int i=0; i<n1; i++){
            leftarr[i] = arr[left+i];
        }
        for(int i=0; i<n2; i++){
            rightarr[i] = arr[mid+1+i];
        }
        
        int i=0, j=0, k=left;
        int invcount = 0;
        
        while(i<n1 && j<n2){
            if(leftarr[i]<= rightarr[j]){
                arr[k++] = leftarr[i++];
            }
            else{
                arr[k++] = rightarr[j++];
                invcount += (n1-i);
            }
        }
        while(i<n1){
            arr[k++] = leftarr[i++];
        }
        while(j<n2){
            arr[k++] = rightarr[j++];
        }
        return invcount;
    }
}










