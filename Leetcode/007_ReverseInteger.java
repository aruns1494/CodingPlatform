/*
 * Given a 32-bit signed integer, reverse digits of an integer.
 * return 0 if overflow occurs
 * Note:
 * Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range. 
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */
class Solution {
    public int reverse(int x) {
        //2147483647
        //-2147483648
        int sign = 1;
        if(x<0){
            sign = -1;
        }
        StringBuilder str = new StringBuilder(String.valueOf(Math.abs(x)));
      //  Long val = Long.parseLong(str.reverse().toString())*sign;
        try{
            int val = Integer.parseInt(str.reverse().toString())*sign;
            return val;
        }
        catch(NumberFormatException nfe){
            return 0;
        }
        
    }
}
