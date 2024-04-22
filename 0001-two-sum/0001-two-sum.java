class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mpa = new HashMap<>();
        int[] two = new int[2];
        for(int i=0;i<nums.length;i++){
            if(mpa.containsKey(target-nums[i])) {
                two[0] = i;
                two[1] = mpa.get(target-nums[i]);
            }
            mpa.put(nums[i],i);
        }
        return two;
    }
}