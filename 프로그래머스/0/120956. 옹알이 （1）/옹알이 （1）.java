import java.util.*;

class Solution {
    
    public int solution(String[] babbling) {
        int count = 0;
        for (String word : babbling) {
            if (isPossible(word))
                count++;
        }
        return count;
    }
    
    private boolean isPossible(String word) {
        if (word.equals(""))
            return true;
        
        if (word.startsWith("aya"))
            return isPossible(word.substring(3));
        
        if (word.startsWith("ye"))
            return isPossible(word.substring(2));
        
        if (word.startsWith("woo"))
            return isPossible(word.substring(3));
        
        if (word.startsWith("ma"))
            return isPossible(word.substring(2));
        
        return false;
    }
}