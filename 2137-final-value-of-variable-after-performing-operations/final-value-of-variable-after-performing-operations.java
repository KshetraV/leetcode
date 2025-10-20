class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int res=0;
        for(int i=0;i<operations.length;i++){
            if((operations[i].substring(1,2)).equals("+")){
                res+=1;
            }
            else{
                res-=1;
            }
        }        
        return res;
    }
}