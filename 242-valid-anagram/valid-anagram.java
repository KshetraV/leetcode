class Solution {
    public boolean isAnagram(String s, String t) {
        int [] charMap1=new int[26];
        int [] charMap2=new int[26];
        if(s.length()!=t.length()) return false;

        for(int i=0;i<s.length();i++){
            charMap1[s.charAt(i)-'a']++;
            charMap2[t.charAt(i)-'a']++;
        }

        for(int i=0;i<26;i++){
            if(charMap1[i]!=charMap2[i]){
                return false;
            }
        }
        return true;
    }
}