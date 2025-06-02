class Solution {
    public int searchInsert(int[] nums, int target) {
        int n =nums.length-1;
        int low=0, high=n;
        while(low<=high){
        int mid=low+(high-low)/2;

        if(target>nums[mid]){
            low=mid+1;
        }

        else if(target<nums[mid]){
           high=mid-1;
        }

        else{
            return mid;
        }
    }
    return low;
    }
}

//[1,3,5,6]

//beg=0 end=n-1 mid=beg+(end-beg)/2;




