/*
 * Given a list of non-negative numbers and a target integer k, write a function to check if the array has a continuous subarray of size at least 2 that sums up 
 * to the multiple of k, that is, sums up to n*k where n is also an integer.
 * 
 * For Example:
 * 	Input: [23, 2, 4, 6, 7],  k=6
 * 	Output: True
 *	Explanation: Because [2, 4] is a continuous subarray of size 2 and sums up to 6.
 * 
 * 	Input: [23, 2, 6, 4, 7],  k=6
 *	Output: True
 *	Explanation: Because [23, 2, 6, 4, 7] is an continuous subarray of size 5 and sums up to 42.
 *
 * Note:
 * 	1. The length of the array won't exceed 10,000.
 * 	2. You may assume the sum of all the numbers is in the range of a signed 32-bit integer.
 *
 */
import java.util.*;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length<=1)
            return false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == 0 && nums[i+1] == 0)
                return true;
        }
        if(k == 0)
            return false;
        k = Math.abs(k);
        int sum = nums[0];
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(sum%k,0);
        for(int i=1;i<nums.length;i++){
            sum += nums[i];
            int rem = sum%k;
            if(rem == 0)
                return true;
            else if(map.containsKey(rem)){
                if(Math.abs(map.get(rem) - i) > 1)
                    return true;
            }
            else
                map.put(rem,i);
        }
        return false;
    }
}
