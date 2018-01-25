/* Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original  
 * place.
 * 
 * The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). 
 * The output should be true or false representing whether the robot makes a circle.
 */

class Solution {
    public boolean judgeCircle(String moves) {
        int up = 0;
        int l = 0;
        for(Character c : moves.toCharArray()){
            if(c == 'U')
                up++;
            else if(c == 'L')
                l++;
            else if(c == 'R')
                l--;
            else
                up--;
        }
        if(l == 0 && up == 0)
            return true;
        else
            return false;
    }
}
