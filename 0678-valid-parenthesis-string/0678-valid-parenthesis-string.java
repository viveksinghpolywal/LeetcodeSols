class Solution {
    public boolean checkValidString(String s) {
        int pass1=0;int pass2=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (s.length() <= 1) {
            return s.equals("*");
        }
           if (ch == '(' || ch == '*') {
                pass1++;
            }
            else{pass1--;}
            if (pass1 < 0) return false;
        }
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch==')' || ch=='*'){
                pass2++;
            }
            else{pass2--;}
            if (pass2 < 0) {
                return false;
            }
        }
        return true;
    }

}