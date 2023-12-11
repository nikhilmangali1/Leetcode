class Solution {
    public int findSpecialInteger(int[] arr) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int num:arr){
            if(mp.containsKey(num)){
                mp.put(num,mp.get(num)+1);
            }
            else{
                mp.put(num,1);
            }
        }
        int moreRepeated=-1;
        int maxCount=0;
        for(Map.Entry<Integer,Integer> e:mp.entrySet()){
            if(e.getValue()>maxCount){
                maxCount=e.getValue();
                moreRepeated=e.getKey();
            }
        }
        return moreRepeated;
    }
}