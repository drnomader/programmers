import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        
        List<Integer> result = new ArrayList<>();
        
        IntStream.of(arr)
            .filter(num -> !result.contains(num))
            .limit(k)
            .forEach(result::add);
        
        while(result.size() < k) {
            result.add(-1);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}