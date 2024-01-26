import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        return Arrays.stream(strArr)
            .filter(item -> !item.contains("ad"))
            .toArray(String[]::new);
    }
}