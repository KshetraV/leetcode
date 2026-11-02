class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int currSum=0,sum=0;
        sum=(n*(n+1))/2;
        for(int i:nums){
            currSum+=i;
        }
        return sum-currSum;
    }
}