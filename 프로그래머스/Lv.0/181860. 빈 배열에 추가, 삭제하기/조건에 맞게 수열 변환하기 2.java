import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            if(flag[i]) {
                for(int j = 0; j < arr[i] * 2; j++) {
                    result.add(arr[i]);
                }
            } else {
                int size = result.size();
                int removeCount = Math.min(size, arr[i]);
                result.subList(size - removeCount, size).clear();
            }
        }
        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}