class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int [] left=new int[n];
        int [] right=new int[n];
        int [] res=new int[n];
        int lprod=1,rprod=1;
        left[0]=1;
        right[n-1]=1;
        for(int i=1;i<n;i++){
            lprod*=nums[i-1];
            left[i]=lprod;
        }

        for(int i=n-2;i>=0;i--){
            rprod*=nums[i+1];
            right[i]=rprod;
        }

        for(int i=0;i<n;i++){
            res[i]=left[i]*right[i];
        }

        return res;

    }
}