import java.util.Arrays;

class Solution {
    public int[] solution(int[] numList) {
        return Arrays.stream(numList)
            .sorted()
            .skip(5)
            .toArray();
    }
}