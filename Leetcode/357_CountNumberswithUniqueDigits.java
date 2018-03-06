/*
 * Given a non-negative integer n, count all numbers with unique digits, x, where 0 ≤ x < 10n.
 *
 * Example:
 * Given n = 2, return 91. (The answer should be the total numbers in the range of 0 ≤ x < 100, excluding [11,22,33,44,55,66,77,88,99])
 *
 */

class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int[] re = new int[n+1];
        Arrays.fill(re,0);
        re[0] = 1;
        for(int i=1;i<=n;i++){
            int result = 9;
            int j=9,k=i-1;
            while(k>0){
                result *= j;
                j--;
                k--;
            }
            if(i<=10)
                re[i] = result;                
        }
        int sum = 0;
        for(int i=0;i<=n;i++)
            sum+=re[i];
        return sum;
    }
}
