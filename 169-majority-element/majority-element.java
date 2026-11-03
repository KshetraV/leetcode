class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i],(hs.getOrDefault(nums[i],0))+1);
        
        }

        for(Map.Entry<Integer,Integer> entry: hs.entrySet()){
            if(entry.getValue()>nums.length/2){
                return entry.getKey();
            }
        }
        
            return -1;
    }
}