class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i==j) continue;
                int product=(nums[i]-1)*(nums[j]-1);
                if(product>maxProduct){
                    maxProduct=product;
                }
            }
        }
        return maxProduct;
    }
}