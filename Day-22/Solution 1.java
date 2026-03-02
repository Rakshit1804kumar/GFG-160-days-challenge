class Solution {
    public int hIndex(int[] citations) {
        
        Arrays.sort(citations);
        int idx = 0;
        int n = citations.length;
        
        while(idx<n && citations[n-1-idx]>idx) idx++;
        
        return idx;
    }
}
