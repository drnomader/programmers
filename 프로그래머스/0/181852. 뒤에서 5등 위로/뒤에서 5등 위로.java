import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        return Arrays.stream(num_list)
            .boxed() // Convert IntStream to Stream<Integer>
            .sorted(Comparator.reverseOrder())
            .limit(num_list.length - 5)
            .sorted()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}