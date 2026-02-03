class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
 
        int n = arr.length;
        
        HashMap<Integer , Integer> freq = new HashMap<>();
        
        // count freq
        for(int num:arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        
        // Collect element appear more than n/3 times
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            if(entry.getValue()>n/3){
                result.add(entry.getKey());
            }
            
        }
        
        Collections.sort(result);
        return result;
    }
}
