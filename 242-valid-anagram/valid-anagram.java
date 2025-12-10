class Solution {
    public boolean isAnagram(String s, String t) {
        char[]ch=new char [26];
        int sl=s.length();
        int tl=t.length();

        if(sl!=tl) return false;

        for(int i=0;i<sl;i++){
            ch[s.charAt(i)-'a']++;
            ch[t.charAt(i)-'a']--;
        }

        for(int i=0;i<ch.length;i++){
            if(ch[i]!=0){
                return false;
            }
        }
        return true;
    }
}