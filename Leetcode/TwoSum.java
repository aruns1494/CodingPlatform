/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */


import java.util.HashMap;

class Solution{
	public int[] twoSum(int[] nums, int target){
		HashMap<Integer, Integer> set = new HashMap<>();
		int[] res = new int[2];
		for(int i=0;i<nums.length;i++){
			set.put(nums[i],i);
		}
		for(int i=0;i<nums.length;i++){
			if(set.containsKey(target-nums[i])){
				int pos = set.get(target-nums[i]);
				if(i != pos) {
					res[0] = i;
					res[1] = pos;
					break;
				}
			}
		}
		return res;
	}
}

