class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
 
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = 0; i<n;i++){
            int count = 0;
            for(int j = 0; j<n;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count> n/3 && !result.contains(arr[i])){
                result.add(arr[i]);
            }
        } 
        
            Collections.sort(result);
        return result;
    }
}
