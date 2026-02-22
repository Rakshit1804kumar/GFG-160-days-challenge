class Solution {
    ArrayList<Integer> search(String pat, String txt) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int n = txt.length();
        int m = pat.length();
        
        for(int i=0; i<n-m; i++){
            int j=0;
            while(j<m && txt.charAt(i+j) == pat.charAt(j)){
                j++;
            }
            
            if(j==m){
                result.add(i);
            }
        }
         
        return result;
    }
     
}





