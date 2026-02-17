
class Solution {
    public String addBinary(String s1, String s2) {

        StringBuilder ans = new StringBuilder();
        
        int i = s1.length()-1;
        int j = s2.length()-1;
        int carry = 0;
        
        while(i>=0 || j>=0){
            int count1s = 0;
            
            if(i>=0 && s1.charAt(i) == '1') count1s++;
            if(j>=0 && s2.charAt(j) == '1') count1s++;
            
            int sum = count1s + carry;
            
            if(sum == 0){
                ans.append('0');
                carry = 0;
            }
            else if(sum == 1){
                ans.append('1');
                carry = 0;
            }
            else if(sum == 2){
                ans.append('0');
                carry = 1;
            }
            else if(sum == 3){
                ans.append('1');
                carry = 1;
            }
            i--;
            j--;
        }
        if(carry == 1) ans.append('1');
        
        ans.reverse();
        int idx = 0;
        while(idx < ans.length()-1 && ans.charAt(idx) == '0') idx++;
        
        return ans.substring(idx);
    }
}


