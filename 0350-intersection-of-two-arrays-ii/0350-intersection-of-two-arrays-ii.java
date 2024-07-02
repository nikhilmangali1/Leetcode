class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int count[] = new int[1001];
        List<Integer> result = new ArrayList<>();
        for(int i:nums1){
            count[i]++;
        }
        for(int i:nums2){
            if(count[i]>0){
                result.add(i);
                count[i]--;
            }
        }
        int actualResult[] = new int[result.size()];
        for(int i=0;i<result.size();i++){
            actualResult[i] = result.get(i);
        }
        return actualResult;
    }
}