class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int longest = 0;
        int count = 0;
        int lastSmall = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==lastSmall){
                count+=1;
                lastSmall = nums[i];
            }
            else if(nums[i]!=lastSmall){
                count = 1;
                lastSmall = nums[i];
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }
}