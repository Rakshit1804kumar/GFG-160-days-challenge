class Solution {
    public boolean areRotations(String s1, String s2) {
        
        if(s1.length()!=s2.length()) return false;
        String text = s1 + s1;
        return kmpSearch(text,s2);
    }
    private boolean kmpSearch(String text, String pattern){
        int n = text.length();
        int m = pattern.length();
        
        int lps[] = buildLps(pattern);
        int i=0, j=0;
        
        while(i<n){
            if(text.charAt(i) == pattern.charAt(j)){
                i++;
                j++;
                if(j==m) return true;
            }else{
                if(j!=0){
                    j=lps[j-1];
                }else{
                    i++;
                }
            }
        }
        return false;
    }
    private int[] buildLps(String pattern){
        int m = pattern.length();
        int[] lps = new int[m];
        
        int i = 0, j=1;
        
        while(j<m){
            if(pattern.charAt(i)== pattern.charAt(j)){
                lps[j] = i+1;
                i++;
                j++;
            }else{
                if(i!=0){
                    i=lps[i-1];
                }
                else{
                    lps[j] = 0;
                    j++;
                }
            }
        }
        return lps;
    }
}





