class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>hs=new HashMap<>();
        for(int i:nums){
            hs.put(i,hs.getOrDefault(i,0)+1);
        }
        int maxValue=0, res=0;
        for(Map.Entry<Integer,Integer> entry: hs.entrySet()){
            int value=entry.getValue();
            if(value>maxValue){
                maxValue=value;
                res=maxValue;
            }
            else if(value==maxValue){
                res+=maxValue;
            }
        }
        return res;
    }
}