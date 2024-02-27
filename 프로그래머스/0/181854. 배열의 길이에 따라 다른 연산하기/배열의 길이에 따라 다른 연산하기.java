import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int n) {
        return IntStream.range(0, arr.length)
            .map(i -> {
                if ((arr.length % 2 == 0 && i % 2 != 0) || (arr.length % 2 != 0 && i % 2 == 0)) {
                    return arr[i] + n;
                } else {
                    return arr[i];
                }
            }).toArray();
    }
}