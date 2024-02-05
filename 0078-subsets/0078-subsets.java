class Solution {

    private void findAllSubSets(int ind,int[] arr,List<List<Integer>> ans,ArrayList<Integer> ds){
        ans.add(new ArrayList<Integer>(ds));
        for(int i = ind;i<arr.length;i++){
            if(i!=ind && arr[i] == arr[i-1]) continue;
            ds.add(arr[i]);
            findAllSubSets(i+1,arr,ans,ds);
            ds.remove(ds.size()-1);
        }
    }


    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        findAllSubSets(0,nums,ans,new ArrayList<Integer>());
        return ans;
    }
}