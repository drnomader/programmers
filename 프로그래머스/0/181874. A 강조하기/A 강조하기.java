import java.util.*;

class Solution {
    public String solution(String myString) {
        
        char[] myChar = myString.toCharArray();
        
        for(int i = 0; i < myChar.length; i++) {
            if(myChar[i] == 'a') {
                myChar[i] = 'A';
            } else if(myChar[i] != 'A') {
                myChar[i] = Character.toLowerCase(myChar[i]);
            }
        }
        return new String(myChar);
    }
}