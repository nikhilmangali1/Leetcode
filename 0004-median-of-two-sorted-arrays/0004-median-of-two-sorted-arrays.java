class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int mergedArr[]=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length+nums2.length;i++){
            if(i<nums1.length){
                mergedArr[i]=nums1[i];
            }
            else{
                mergedArr[i]=nums2[i-nums1.length];
            }
        }
        Arrays.sort(mergedArr);
        if(mergedArr.length%2==0) return (mergedArr[mergedArr.length/2]+mergedArr[mergedArr.length/2-1])/2.0;
        return (double)mergedArr[mergedArr.length/2];
    }
}