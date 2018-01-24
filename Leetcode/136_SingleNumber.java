/*
 * Given an array of integers, every element appears twice except for one. Find that single one. 
 */

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(Integer a : nums){
            if(map.containsKey(a)){
                map.remove(a);
            }
            else
                map.put(a,0);
        }
        return Integer.parseInt(map.keySet().toArray()[0].toString());
    }
}
