class Solution {

    public void findCombinations(int i,int[] arr,int target, List<List<Integer>> res, List<Integer> list){
        if(i>=arr.length){
            if(target==0){
                res.add(new ArrayList<Integer>(list));
            }
             return;
        }
        if(i<arr.length && arr[i]<=target){
            list.add(arr[i]);
            findCombinations(i,arr,target-arr[i],res,list);
            list.remove(list.size()-1);
        }
        findCombinations(i+1,arr,target,res,list);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        findCombinations(0,candidates,target,res,new ArrayList<>());
        return res;
    }
}