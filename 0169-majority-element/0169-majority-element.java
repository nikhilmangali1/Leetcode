class Solution {
    public int majorityElement(int[] nums) {
       int ele = Integer.MAX_VALUE;
       int count = 0;
       for(int i:nums){
        if(count==0){
            count = 1;
            ele = i;
        }
        else if(i==ele){
            count++;
        }
        else{
            count--;
        }
       }
       int count1 = 0;
       for(int i:nums){
        if(i==ele) count1++;
       }
       if(count1>nums.length/2) return ele;
       return -1;
    }
}