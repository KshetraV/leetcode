class Solution {
    public boolean isAnagram(String s, String t) {
        int [] charMap1=new int[26];
       
        if(s.length()!=t.length()) return false;

        for(int i=0;i<s.length();i++){
            charMap1[s.charAt(i)-'a']++;
            charMap1[t.charAt(i)-'a']--;
        }

        for(int i=0;i<26;i++){
            if(charMap1[i]!=0){
                return false;
            }
        }
        return true;
    }
}