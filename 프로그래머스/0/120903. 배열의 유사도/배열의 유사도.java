import java.util.Arrays;

class Solution {
    public int solution(String[] s1, String[] s2) {
        long count = Arrays.stream(s1)
            .filter(str -> Arrays.stream(s2).anyMatch(str::equals))
            .count();
        return (int) count;
    }
}