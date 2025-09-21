class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        List<List<Integer>> list = new ArrayList<>();
        int n=nums.length;

        for(int i=0;i<n;i++){
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }

        for(int i=0;i<=n;i++){
            list.add(new ArrayList<>());
        }

        for(Map.Entry<Integer, Integer> entry:hs.entrySet()){
            int key=entry.getKey();
            int index=entry.getValue();
            list.get(index).add(key);
        }
        int [] res = new int[k];
        int index=0;
        for(int i=list.size()-1;i>=0;i--){
            for(int j=0;j<list.get(i).size();j++){
                res[index++]=list.get(i).get(j);
                if(k==index) return res;
            }
        }

        return res;
    }
    
}