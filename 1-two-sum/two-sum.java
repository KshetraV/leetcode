class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hs.containsKey(target-nums[i])){
                int[]res=new int[2];
                res[0]=i;
                res[1]=hs.get(target-nums[i]);
                return res;
            }
            hs.put(nums[i],i);
            
        }
        return new int[]{-1,-1};
    }

}