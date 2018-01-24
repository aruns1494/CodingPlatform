/*
 * In a given integer array nums, there is always exactly one largest element.
 * 
 * Find whether the largest element in the array is at least twice as much as every other number in the array.
 *
 * If it is, return the index of the largest element, otherwise return -1.
 */

class Solution {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int pos = 0;
        
        for(int i=1;i<nums.length;i++){
            if(max<nums[i]){
                max = nums[i];
                pos = i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i!= pos ){
                if(max < 2*nums[i])
                    return -1;
            }
        }
        return pos;
    }
}
