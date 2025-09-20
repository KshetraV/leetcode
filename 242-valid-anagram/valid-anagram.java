class Solution {
    public boolean isAnagram(String s, String t) {
        int[]charArr=new int[26];

        if(s.length()!=t.length()) return false;

        for(int i=0;i<s.length();i++){
            charArr[s.charAt(i)-'a']++;
            charArr[t.charAt(i)-'a']--;
        }

        for(int i:charArr){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}