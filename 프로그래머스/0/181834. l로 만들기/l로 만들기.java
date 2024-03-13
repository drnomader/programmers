import java.lang.StringBuilder;

class Solution {
    public String solution(String myString) {
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < myString.length(); i++) {
            char currentChar = myString.charAt(i);
            if(currentChar < 'l') {
                result.append('l');
            } else {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}