
class Solution {
    public int minChar(String s) {
   
        String rev = new StringBuilder(s).reverse().toString();
        String combine = s+"*"+rev;
        
        int n = combine.length();
        int[] lps = new int[n];
        
        int len = 0;
        int i=1;
        
        while(i<n){
            if(combine.charAt(i) == combine.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len!=0){
                    len = lps[len-1];
                }else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        
        return s.length()- lps[n-1];
    }
     
}
