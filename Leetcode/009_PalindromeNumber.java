/**
 * Determine whether an integer is a palindrome.
 */

class Solution {
    public boolean isPalindrome(int x) {
        String S = String.valueOf(x);
        for(int i=0,j=S.length()-1;i<j;i++,j--){
            if(S.charAt(i) != S.charAt(j))
                return false;
        }
        return true;
    }
}
