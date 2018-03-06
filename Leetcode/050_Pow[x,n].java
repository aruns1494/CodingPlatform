/*
 * Implement pow(x, n).
 * 
 * 
 * Example 1:
 * 
 * Input: 2.00000, 10
 * Output: 1024.00000
 * Example 2:
 * 
 * Input: 2.10000, 3
 * Output: 9.26100
 */

class Solution {
    public double myPow(double x, int n) {
        TreeMap<Integer,Double> map = new TreeMap<>();
        double res = 1;
        int pow = Math.abs(n);
        if(n == Integer.MIN_VALUE){
            if(x == 1 || x == -1)
                return 1;
            return 0;
            
        }
        
        if(pow == 0){
            return res;
        }
        res = x;
        
        int i=1;
        map.put(i,res);
        while(i<pow){
            if(i<1073741824 && pow>=(i*2)){
                res = res*res;
                i+=i;
                map.put(i,res);
            }
            else{
                int tem = pow-i;
                if(map.containsKey(tem)){
                    res *= map.get(tem);
                    i = i+tem;
                }
                else{
                    res *= map.floorEntry(tem).getValue();
                    i = i+map.floorEntry(tem).getKey();
                    
                }
            }
            System.out.println("I = "+i+"\tPOW = "+res);
        }
        if(n>0)
            return res;
        else
            return 1/res;
    }
}