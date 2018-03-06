/*
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * 
 * Given two integers x and y, calculate the Hamming distance.
 *
 * Note:
 * 0 ≤ x, y < 231.
 *
 * Example:
 *
 * Input: x = 1, y = 4
 *
 * Output: 2
 *
 * Explanation:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *        ↑   ↑
 *
 * The above arrows point to positions where the corresponding bits are different.
 *
 */

class Solution {
    public int hammingDistance(int x, int y) {
        String S1 = String.format("%32s",Integer.toBinaryString(x)).replace(" ","0");
        String S2 = String.format("%32s",Integer.toBinaryString(y)).replace(" ","0");
        System.out.println(S1+"\t"+S2);
        int hamm = 0;
        for(int i=0;i<S1.length();i++){
            if(S1.charAt(i) != S2.charAt(i))
                hamm++;
        }
        return hamm;
    }
}
