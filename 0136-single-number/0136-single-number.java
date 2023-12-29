class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int value=map.getOrDefault(nums[i],0);
            map.put(nums[i],value+1);
        }
        for(Map.Entry<Integer,Integer> mp:map.entrySet()){
            if(mp.getValue()==1)
            {
                return mp.getKey();
            }
        }
        return -1;
    }
}