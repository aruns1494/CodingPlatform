/*
 * Given an integer, write a function to determine if it is a power of two.
 */

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0)
            return false;
        else if(Math.ceil(Math.log10(n)/Math.log10(2)) == Math.floor(Math.log10(n)/Math.log10(2)) )
            return true;
        else
            return false;
    }
}