import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Long> freq = Arrays.stream(array)
            .boxed()
            .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        long max = Collections.max(freq.values());

        List<Integer> modes = freq.entrySet().stream()
            .filter(e -> e.getValue() == max)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());

        return modes.size() > 1 ? -1 : modes.get(0);
    }
}