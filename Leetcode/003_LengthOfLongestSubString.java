/* 

Given a string, find the length of the longest substring without repeating characters.
LANGUAGE : JAVA

*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int maxLen = 1;
        int curLen = 1;
        int[] visited = new int[256];
        if(length == 0)
            return 0;
        for(int i=0;i<256;i++)
            visited[i] = -1;
        visited[s.charAt(0)] = 0;
        for(int i=1;i<length;i++){
            int prev = visited[s.charAt(i)];
            if(prev == -1 || i-curLen > prev)
                curLen++;
            else{
                if(curLen>maxLen){
                    maxLen = curLen;
                }
                curLen = i-prev;
            }
            visited[s.charAt(i)] = i;
        }
        if(curLen>maxLen){
            maxLen = curLen;
        }
        return maxLen;
    }
}
