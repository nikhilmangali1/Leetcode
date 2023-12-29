class Solution {
    public int singleNumber(int[] nums) {
        int xorRes=0;
        for(int i:nums) xorRes^=i;
        return xorRes;
    }
}