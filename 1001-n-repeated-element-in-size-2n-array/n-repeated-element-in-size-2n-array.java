class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length/2;
        HashMap<Integer, Integer> hs = new HashMap<>();
        int maxCount=0;
        for(int i:nums){
            hs.put(i, hs.getOrDefault(i,0)+1);
               maxCount=Math.max(maxCount,hs.get(i));
               if(maxCount==n){
                return i;
                }
    }
    return -1;
}
}