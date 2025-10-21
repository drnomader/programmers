import java.util.*;

class Solution {
    public String solution(String letter) {
         Map<String, String> morse = new HashMap<>();
        String[] morseCode = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
            "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
            "..-","...-",".--","-..-","-.--","--.."
        };

        for (int i = 0; i < morseCode.length; i++) {
            morse.put(morseCode[i], String.valueOf((char) ('a' + i)));
        }

        String[] words = letter.split(" ");
        StringBuilder answer = new StringBuilder();

        for (String word : words) {
            answer.append(morse.get(word));
        }

        return answer.toString();
    }
}