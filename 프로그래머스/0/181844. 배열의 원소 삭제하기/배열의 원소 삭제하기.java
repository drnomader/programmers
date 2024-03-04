import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> deleteSet = Arrays.stream(delete_list)
            .boxed()
            .collect(Collectors.toSet());
        
        List<Integer> result = Arrays.stream(arr)
            .filter(num -> !deleteSet.contains(num))
            .boxed()
            .collect(Collectors.toList());
        
        return result.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}