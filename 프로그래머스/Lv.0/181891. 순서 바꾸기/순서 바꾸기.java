import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int[] first = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] second = Arrays.copyOfRange(num_list, 0, n);
        int[] answer = new int[first.length + second.length];
        System.arraycopy(first, 0, answer, 0, first.length);
        System.arraycopy(second, 0, answer, first.length, second.length);
        return answer;
    }
}