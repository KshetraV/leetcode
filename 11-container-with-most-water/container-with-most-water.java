class Solution {
    public int maxArea(int[] nums) {
        int i=0, j=nums.length-1;
        int maxCount=0, count=0, height=1, length=1;
        while(i<j){
            height=Math.min(nums[i],nums[j]);
            length=j-i;
            count=height*length;
            maxCount=Math.max(count,maxCount);

            if(nums[i]<nums[j]){
                i++;
            }
            else if(nums[i]>nums[j]){
                j--;
            }
            else{
                i++;
                j--;
            }
        }
        return maxCount;
    }

}