class Solution {
    public boolean check(int[] nums) {
        int count=1;
        int l=nums.length;
        if(l==count) return true;
        int[]dup=new int[l*2];
        for(int i=0;i<l;i++){
            dup[i]=nums[i];
        }
        int j=0;
        for(int i=nums.length;i<l*2;i++){
            dup[i]=nums[j++];
        }

    
        for(int i=1;i<dup.length;i++){
            if(dup[i]>=dup[i-1]){
                count++;
                if(count==l) return true;
            }
            
            else count=1;
            // System.out.print(count);
        }
        return count==l;
    }
}

// 3 4 5 1 2 3 4 5 1 2 