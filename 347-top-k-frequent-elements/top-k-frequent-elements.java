class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        List<List<Integer>> listOfLists = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<=nums.length;i++){
            listOfLists.add(new ArrayList<>());
        }

        for(Map.Entry<Integer, Integer> entry: hs.entrySet()){
            int key=entry.getKey();
            int index=entry.getValue();
            listOfLists.get(index).add(key);
        }
        int []res=new int[k];
        int idx=0;
        for (int i=listOfLists.size()-1; i>=0; i--) {
            for (int j = 0; j < listOfLists.get(i).size(); j++) {
                res[idx++]=listOfLists.get(i).get(j);
                if(idx==k) return res;
            }
       }
       return res;
    }
    
}