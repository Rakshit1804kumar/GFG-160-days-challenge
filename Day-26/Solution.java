class Solution {
    public int minRemoval(int intervals[][]) {
        
        int count = 0 ;
        int n = intervals.length;
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        
        int prev = intervals[0][1];
        
        for(int i = 1; i<n;i++){
            if(intervals[i][0]<prev){
                count++;
                prev = Math.min(prev, intervals[i][1]);
            }else{
                prev = intervals[i][1];
            }
        }
        return count;
    }
}
