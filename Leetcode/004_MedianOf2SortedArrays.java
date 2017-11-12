/*
There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

LANGUAGE : JAVA
*/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        int j=0;
        for(int i=0;i<nums1.length;i++){
            result[j] = nums1[i];
            j++;
        }
        for(int i=0;i<nums2.length;i++){
            result[j] = nums2[i];
            j++;
        }
        Arrays.sort(result);
        if(result.length %2 != 0){
            return (double)result[result.length/2];
        }
        else{
            int a = result[result.length/2];
            int b = result[result.length/2 - 1];
            return (double)(a+b) / 2;
        }
    }
}
