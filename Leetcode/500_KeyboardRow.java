/**
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
 *
 */

class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        String top = "qwertyuiop";
        String middle = "asdfghjkl";
        String low = "zxcvbnm";
        for(String k : words){
            String w = k.toLowerCase();
            int count = 0;
            for(int i=0;i<w.length();i++){
                if(top.indexOf(w.charAt(i)) >=0){
                    if(count == 0)
                        count = 1;
                    else if(count != 1){
                        count = 10;   
                        break;
                    }
                }
                else if(middle.indexOf(w.charAt(i)) >=0){
                    if(count == 0)
                        count = 2;
                    else if(count != 2){
                        count = 10;
                        break;
                    }
                }
                else{
                    if(count == 0)
                        count = 3;
                    else if(count != 3){
                        count = 10;
                        break;
                    }
                }
                    
            }
            System.out.println(w + " "+ count);
            if((count == 1) || (count  == 2) || (count == 3))
                list.add(k);
        }
        String[] ar = new String[list.size()];
        int i=0;
        for(String s : list){
            ar[i] = s;
            i++;
        }
        return ar;
    }
}