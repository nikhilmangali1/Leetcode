class Solution {
    public int missingNumber(int[] nums) {
        int mis=0;
        for(int i=0;i<nums.length+1;i++){
            int flag=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==i){
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                mis=i;
            }
        }
        return mis;
    }
}