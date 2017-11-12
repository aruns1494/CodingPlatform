/* Given two strings representing two complex numbers.

 * You need to return a string representing their multiplication. Note i2 = -1 according to the definition.

 * The input strings will not have extra blank.
 * The input strings will be given in the form of a+bi, where the integer a and b will both belong to the range of [-100, 100]. And the output should be also in this form.
 */
class Solution {
    public String complexNumberMultiply(String a, String b) {
        /* Let Number be A + Bi and C+Di
         * Product = (AC-BD) + (AD+BC)i
         */
        a = a.replace('+','/');
        b = b.replace('+','/');
        String[] s1 = a.split("/");
        String[] s2 = b.split("/");
        int A = Integer.parseInt(s1[0]);
        int B = Integer.parseInt(s1[1].substring(0,s1[1].indexOf('i')));
        int C = Integer.parseInt(s2[0]);
        int D = Integer.parseInt(s2[1].substring(0,s2[1].indexOf('i')));
        
        String result = String.valueOf(A*C - B*D) + "+"+String.valueOf(A*D + B*C)+"i";
        return result;
    }
}
