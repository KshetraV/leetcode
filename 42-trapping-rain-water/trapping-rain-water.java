class Solution {
    public int trap(int[] nums) {
       int n=nums.length;

       int[]pref=new int[n];
       int[]suff=new int[n];

       int max=nums[0];
       pref[0]=0;
        System.out.print(pref[0]+ " ");

       for(int i=1;i<n;i++){
        pref[i]=max;
        System.out.print(pref[i]+ " ");
        if(nums[i]>max) max=nums[i];
        
       }

        max=nums[n-1];
        suff[n-1]=0;

        for(int i=n-2;i>=0;i--){
            suff[i]=max;
        if(nums[i]>max) max=nums[i];

        }
        int minHeight=0, twater=0, water=0;

        for(int i=0;i<n;i++){
            minHeight=Math.min(pref[i],suff[i]);
            twater=minHeight-nums[i];
            if(twater>0){
                water+=twater;
            }
            
        }
        return water;
    }   
}