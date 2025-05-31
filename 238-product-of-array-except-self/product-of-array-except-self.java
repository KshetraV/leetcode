class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[]res1=new int[nums.length];
        int prod=1;
        res1[0]=prod;
        for(int i=1;i< nums.length;i++){
            prod*=nums[i-1];
            res1[i]=prod;
        }
        prod=1;
        int[]res2=new int[nums.length];
        res2[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            prod*=nums[i+1];
            res2[i]=prod;
        }

        for(int i=0;i<nums.length;i++){
            res1[i]*=res2[i];
        }
        return res1;
    }
}