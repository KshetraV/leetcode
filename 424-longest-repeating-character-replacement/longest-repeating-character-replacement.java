class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> hs=new HashMap<>();
        int left=0, right=0, maxCount=0, maxLen=0;

        for( right=0;right<s.length();right++){
            char curr=s.charAt(right);
            hs.put(curr,hs.getOrDefault(curr,0)+1);
            maxCount=Math.max(maxCount, hs.get(curr));

            if((right-left+1) -maxCount > k){
                hs.put(s.charAt(left), hs.get(s.charAt(left))-1);
                left++;
            }

            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
        
    }
    
}