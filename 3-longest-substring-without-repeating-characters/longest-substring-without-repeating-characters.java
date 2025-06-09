class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hs=new HashMap<>();
            int prev=0;
            int count=0,maxCount=0;
            for(int i=0;i<s.length();i++){
                if (hs.containsKey(s.charAt(i)) && hs.get(s.charAt(i)) >= prev) {
                    prev = hs.get(s.charAt(i)) + 1;
                }
                hs.put(s.charAt(i),i);
                maxCount=Math.max(maxCount,i-prev+1);

            }
            return maxCount;
        }
    }