class Solution {
    public boolean checkInclusion(String s1, String s2) {

        char[]ch1=new char[26];
        char[]ch2=new char[26];
        if(s1.length()>s2.length()){ return false;}
        int match=0;
        for(int i=0;i<s1.length();i++){
            ch1[s1.charAt(i)-'a']++;
            ch2[s2.charAt(i)-'a']++;
        }

        int m=0;

        for(int j=0;j<26;j++){
            if(ch1[j]==ch2[j]){
                m++;
            }
        }
        
        int l=0;
        for(int r=s1.length();r<s2.length();r++){
            if(m==26) return true;

            int curr=s2.charAt(r)-'a';

            ch2[curr]++;
            if(ch1[curr]==ch2[curr]){
                m++;
            }
            else if(ch1[curr]==ch2[curr]-1){
                    m--;
            }

            curr=s2.charAt(l)-'a';
            ch2[curr]--;
            
            if(ch1[curr]==ch2[curr]){
                m++;
            }
            else if(ch1[curr]-1==ch2[curr]){
                    m--;
            }
            l++;

            
        }
        return m==26;

            
        }



    }