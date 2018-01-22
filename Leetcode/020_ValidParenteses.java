/* Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * 
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        boolean flag = false;
        for(Character c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '[')
                stack.push(c);
            else if(c == ')'){
                if(!stack.isEmpty() && stack.peek() == '(')
                    stack.pop();
                else
                    return false;
            }
            else if(c == '}'){
                if(!stack.isEmpty() && stack.peek() == '{')
                    stack.pop();
                else
                    return false;
            }
            else if(c == ']'){
                if(!stack.isEmpty() && stack.peek() == '[')
                    stack.pop();
                else
                    return false;
            }
            else
                return false;
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
}
