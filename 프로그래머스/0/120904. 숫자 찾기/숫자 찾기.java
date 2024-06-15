import java.util.Arrays;

class Solution {
    public int solution(int num, int k) {
        int index = Integer.toString(num).indexOf(Integer.toString(k));
        return (index == -1) ? index : index + 1;
    }
}