class Solution {
    public int minChar(String s) {
        
        String rev = new StringBuilder(s).reverse().toString();
        String combine = s+"*"+rev;
        int cut = lps(combine);
        return s.length()-cut;
    }
    public int lps(String str){
        int n=str.length();
        int p = 0, s=1,pos =1,count =0;
        
        while(p<n && s<n){
            if(str.charAt(p) == str.charAt(s)){
                p++;
                s++;
                count++;
            }else{
                p=0;
                pos++;
                s=pos;
                count=0;
            }
        }
        return count;
    }
}
