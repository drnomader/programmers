import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        boolean found = Arrays.stream(dic)
            .anyMatch(word -> {
                for (String s : spell) {
                    int count = word.length() - word.replace(s, "").length();
                    if (count != 1) {
                        return false;
                    }
                }
                return true;
            });
        return found ? 1 : 2;
    }
}