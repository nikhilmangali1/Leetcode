class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            int value = map.getOrDefault(i,0);
            map.put(i,value+1);
        }
        for(Map.Entry<Integer,Integer> it:map.entrySet()){
            if(it.getValue()>nums.length/2){
                return it.getKey();
            }
        }
        return -1;
    }
}