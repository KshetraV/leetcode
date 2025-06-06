class Solution {
    public int[] twoSum(int[] nums, int target) {
        //1 2 3 4 5 10
        int i=0,j=nums.length-1;
        while(i<j){
            if(nums[i]+nums[j]==target){
                return new int[]{i+1,j+1};
            }
            else if(nums[i]+nums[j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        return new int[]{-1,-1};
    }
}