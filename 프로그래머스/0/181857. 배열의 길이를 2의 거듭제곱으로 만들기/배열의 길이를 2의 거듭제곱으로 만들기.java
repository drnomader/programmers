import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        return setArray(arr);
    }
    
    private int[] setArray(int[] arr) {
        int length = arr.length;
        
        while(!isPowerOfTwo(length)) {
            length++;
        }
        int[] result = Arrays.copyOf(arr, length);
        return result;
    }
    
    private boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0 && n != 0;
    }
}