class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        int res = 0;
        for (int num : nums) {
            if (!mp.containsKey(num)) {
                int left=mp.getOrDefault(num-1,0);
                int right=mp.getOrDefault(num+1,0);
                int length=left+right+1;

                mp.put(num,length);
                mp.put(num-left,length);
                mp.put(num+right,length);
                res=Math.max(res,mp.get(num));
        }
        }
        return res;       
        }
}
    