import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        return Arrays.stream(numlist)
            .mapToObj(a -> (Integer) a)
            .sorted((a, b) -> {
                int i = Math.abs(n - a);
                int j = Math.abs(n - b);
                if (i == j) {
                    return b - a;
                } else {
                    return i - j;
                }
            })
            .mapToInt(a -> a)
            .toArray();
    }
}