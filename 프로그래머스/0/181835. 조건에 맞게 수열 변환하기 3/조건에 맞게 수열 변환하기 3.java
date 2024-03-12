import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        return Arrays.stream(arr)
            .map(num -> {
                if(k % 2 == 0) {
                    return num + k;
                } else {
                    return num * k;
                }
            }).toArray();
    }
}