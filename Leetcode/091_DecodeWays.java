/*
 * A message containing letters from A-Z is being encoded to numbers using the following mapping:
 * 	'A' -> 1
 * 	'B' -> 2
 * 	...
 * 	'Z' -> 26
 * Given an encoded message containing digits, determine the total number of ways to decode it.
 * 
 * For example,
 * Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).
 * 
 * The number of ways decoding "12" is 2.
 *
 */
class Solution {
    public int numDecodings(String s) {
        int length = s.length();
        if(length == 0)
            return 0;
        int[] array = new int[length+1];
        array[length] = 1;
        array[length-1] = s.charAt(length-1) == '0' ? 0 : 1;
        for(int i=length-2;i>=0;i--){
            if (s.charAt(i) == '0')
                continue;
            else
                array[i] = (Integer.parseInt(s.substring(i,i+2)))<=26 ?  array[i+1] + array[i+2] : array[i+1] ;
        }
        return array[0];
    }
}
