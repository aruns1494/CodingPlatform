/**
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 *
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 */

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        else{
            int[] dp = new int[nums.length];
            int curMax = nums[0];
            dp[0] = nums[0];
            for(int i=1;i<nums.length;i++){
                dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
                if(dp[i] > curMax)
                    curMax = dp[i];
            }
            return curMax;
        }
    }
}