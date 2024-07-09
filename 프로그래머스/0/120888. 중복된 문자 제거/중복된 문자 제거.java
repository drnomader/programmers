import java.util.Set;
import java.util.LinkedHashSet;

class Solution {
    public String solution(String my_string) {
        Set<Character> charSet = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if (charSet.add(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}