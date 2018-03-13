 /**
 * Given a list of non negative integers, arrange them such that they form the largest number.
 * 
 * For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.
 * 
 * Note: The result may be very large, so you need to return a string instead of an integer.
 */
 
class Solution {
    public String largestNumber(int[] nums) {
        int c = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0)
                break;
            else
                c++;
        }
        if(c == nums.length)
            return "0";
        String[] arr = new  String[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] =  String.valueOf(nums[i]);
        }
        Comparator<String> comp = new Comparator<String>(){
		    @Override
		    public int compare(String str1, String str2){
		    		String s1 = str1 + str2;
			    	String s2 = str2 + str1;
			    	return s2.compareTo(s1); 
		    }
	    };
        Arrays.sort(arr,comp);
        StringBuffer sb = new StringBuffer();
        for(String s : arr)
            sb.append(s);
        return sb.toString();
    }
}
