class Solution {

    private void findPermutations(int[] arr,List<Integer> ds,List<List<Integer>> ans,boolean[] freq){
        if(ds.size() == arr.length){
            ans.add(new ArrayList<Integer>(ds));
            return;
        }
        for(int i = 0;i<arr.length;i++ ){
            if(!freq[i]){
                freq[i] = true;
                ds.add(arr[i]);
                findPermutations(arr,ds,ans,freq);
                ds.remove(ds.size()-1);
                freq[i] = false;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
        findPermutations(nums,ds,ans,freq);
        return ans;
    }
}