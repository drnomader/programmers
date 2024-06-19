import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        return s.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
            .entrySet().stream()
            .filter(e -> e.getValue() == 1L)
            .map(e -> String.valueOf(e.getKey()))
            .sorted()
            .collect(Collectors.joining());
    }
}