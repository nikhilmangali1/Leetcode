class Solution {
    public int[] rearrangeArray(int[] nums) {
        int size = nums.length;
        int[] ansLi = new int[size];
        int posIndex = 0;
        int negIndex = 1;
        for(int i = 0;i<size;i++){
            if(nums[i]<0){
                ansLi[negIndex]=nums[i];
                negIndex+=2;
            }
            else{
                ansLi[posIndex]=nums[i];
                posIndex+=2;
            }
        }
        return ansLi;
    }
}