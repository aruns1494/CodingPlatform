/* 
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
 *
 * You may assume the integer do not contain any leading zero, except the number 0 itself.
 *
 * The digits are stored such that the most significant digit is at the head of the list.
 */

class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        digits[digits.length-1] += 1;
        for(int i=digits.length-1;i>=0;i--){
            digits[i]+=carry;
            if(digits[i]>=10){
                digits[i] %= 10;
                carry = 1;
            }
            else{
                carry = 0;
                break;
            }
        }
        if(carry == 1){
            int[] result = new int[digits.length+1];
            Arrays.fill(result,0);
            result[0] = 1;
            return result;
        }
        else
            return digits;
    }
}
