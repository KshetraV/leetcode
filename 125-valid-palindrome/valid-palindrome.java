class Solution {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<j){
            if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            char begin=(Character.toLowerCase(s.charAt(i)));
            char end=(Character.toLowerCase(s.charAt(j)));

            if((Character.isLetterOrDigit(begin) && Character.isLetterOrDigit(end))){
                if(begin!=end){
                    return false;
                }
                i++;
                j--;
            }



        }
        return true;
    }
    }
    
