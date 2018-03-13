/*
 * Given an encoded string, return it's decoded string.
 * 
 * The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
 * 
 * You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.
 * 
 * Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].
 * 
 * Examples:
 * 
 * s = "3[a]2[bc]", return "aaabcbc".
 * s = "3[a2[c]]", return "accaccacc".
 * s = "2[abc]3[cd]ef", return "abcabccdcdcdef".
 * 
 */

class Solution {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder str = new StringBuilder();
        boolean flag = false;
        int pos = s.lastIndexOf(']');
        for(int i=0;i<=pos;i++){
            if(s.charAt(i) == '['){
                stack.push("[");
                flag = false;
            }
            else if(s.charAt(i) == ']'){
                String pattern = stack.pop();
                stack.pop();
                int times = Integer.parseInt(stack.pop());
                String pat = "";
                for(int k=0;k<times;k++){
                    pat += pattern;
                }
                if(stack.isEmpty())
                    stack.push(pat);
                else{
                    if(stack.peek().equals("["))
                        stack.push(pat);
                    else{
                        String top = stack.pop()+pat;
                        stack.push(top);
                        
                    }
                }
                flag = true;
            }
            else if(Character.isDigit(s.charAt(i))){
                int num = 0;
                while(Character.isDigit(s.charAt(i))){
                    num = num*10 + s.charAt(i)-'0';
                    i++;
                }
                stack.push(String.valueOf(num));
                i--;
                flag = false;
            }
            else{
                String temp = "";
                while((s.charAt(i)>='a' && s.charAt(i) <= 'z') ||(s.charAt(i)>='A' && s.charAt(i) <= 'Z')) {
                    temp+= String.valueOf(s.charAt(i));
                    i++;
                }
                i--;
                if(flag){
                    stack.push(stack.pop()+temp);
                }
                else
                    stack.push(temp);
                    
                flag = false;
            }
            
        }
        if(!stack.isEmpty()){
            str.append(stack.pop());
            
        }
        if(pos != s.length()-1){
                str.append(s.substring(pos+1));
            }
        return str.toString();
    }
}