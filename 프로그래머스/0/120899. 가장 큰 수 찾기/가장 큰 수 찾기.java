import java.util.Arrays;

class Solution {
    public int[] solution(int[] array) {
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        return new int[]{max, maxIndex};
    }
}