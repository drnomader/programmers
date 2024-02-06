import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(result.isEmpty() || i == 0 || arr[i] != result.get(result.size() - 1)) {
                result.add(arr[i]);
            } else if(arr[i] == result.get(result.size() - 1)) {
                result.remove(result.size() - 1);
            }
        }
        return result.isEmpty() ? new int[] {-1} : result.stream().mapToInt(Integer::intValue).toArray();
    }
}