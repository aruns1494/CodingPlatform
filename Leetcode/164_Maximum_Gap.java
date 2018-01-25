/* Given an unsorted array, find the maximum difference between the successive elements in its sorted form. 
 *
 * Try to solve it in linear time/space.
 *
 * Return 0 if the array contains less than 2 elements.
 *
 * You may assume all elements in the array are non-negative integers and fit in the 32-bit signed integer range.
 */
class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length <2)
            return 0;
        else{
            Arrays.sort(nums);
            int diff = Integer.MIN_VALUE;
            for(int i=0;i<nums.length-1;i++)
                if(nums[i+1] - nums[i] > diff )
                    diff = nums[i+1]-nums[i];
            return diff;
        }
        
    }
}
