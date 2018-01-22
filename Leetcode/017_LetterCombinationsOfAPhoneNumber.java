/* 
 * Given a digit string, return all possible letter combinations that the number could represent.
 * 	Input:Digit string "23"
 * 	Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * Note:
 * 	Although the above answer is in lexicographical order, your answer could be in any order you want.
 */

import java.util.*;
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new  ArrayList<>();
        if(digits.length() == 0 || digits.indexOf('0') != -1 || digits.indexOf('1') != -1)
            return list;
        String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        for(int i=0;i<digits.length();i++){
            String temp = map[Integer.parseInt(digits.substring(i,i+1))];
            if(i==0){
                for(Character c : temp.toCharArray())
                    list.add(String.valueOf(c));
            }
            else{
                List<String> tempList = new ArrayList<>();
                for(int j=0;j<list.size();j++){
                    for(Character c:temp.toCharArray()){
                        tempList.add(list.get(j)+String.valueOf(c));
                    }
                }
                list = tempList;
            }
        }
        return list;
    }
}
