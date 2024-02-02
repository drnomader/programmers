import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        
        int length = Arrays.stream(arr).sum();
        int[] result = new int[length];
        int index = 0;
        
        for(int num : arr) {
            for(int i = 0; i < num; i++) {
                result[index++] = num;
            }
        }
        return result;
    }
}