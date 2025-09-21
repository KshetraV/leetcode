class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
         int[]l=new int[n];
         int[]r=new int[n];
         int lp=1,rp=1;
         l[0]=1;
         r[n-1]=1;
         int p=1;

         for(int i=1;i<n;i++){
            p*=nums[i-1];
            l[i]=p;
         }
        p=1;
         for(int i=n-2;i>=0;i--){
            p*=nums[i+1];
            r[i]=p;
         }

         for(int i=0;i<n;i++){
            r[i]*=l[i];
         }
         return r;
      }
}