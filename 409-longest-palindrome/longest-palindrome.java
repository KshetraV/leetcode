class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>hs=new HashMap<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0)+1);
        }

                boolean oddFound = false;

        for (int freq : hs.values()) {
            count += (freq / 2) * 2; 
            if (freq % 2 != 0) {
                oddFound = true;
            }
        }
        if (oddFound) count++; 
        return count;
    }
}