class Solution {
    public int missingNumber(int[] nums) {
        int xor1=0,xor2=0;
        for(int i=1;i<=nums.length;i++){
            xor1=xor1^i;
        }
        for(int i:nums){
            xor2=xor2^i;
        }
        return xor1^xor2;
    }
}