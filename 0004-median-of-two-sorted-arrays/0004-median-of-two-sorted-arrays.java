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
        int totalLen=mergedArr.length;
        double median;
        if(totalLen%2==0) median=(mergedArr[totalLen/2]+mergedArr[totalLen/2-1])/2.0;
        else median=(double)mergedArr[totalLen/2];
        return median;
    }
}