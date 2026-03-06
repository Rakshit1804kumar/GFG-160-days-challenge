class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        
        Arrays.sort(arr,(a,b)-> a[0]-b[0]);
        
        ArrayList<int[]> ans = new ArrayList<>();
        
        for(int i = 0; i<arr.length; i++){
            if(ans.isEmpty() || ans.get(ans.size()-1)[1] < arr[i][0]){
                ans.add(new int[] {arr[i][0],arr[i][1]});
            }
            else{
                ans.get(ans.size()-1)[1] = Math.max(ans.get(ans.size()-1)[1],arr[i][1]);
            }
        }
        return ans;
    }
}
