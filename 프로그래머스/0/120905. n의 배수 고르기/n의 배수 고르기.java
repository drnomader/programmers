import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int count = 0;
        
        for(int num : numlist) {
            if(num % n == 0) {
                count++;
            }
        }
        
        int[] result = new int[count];
        int index = 0;
        
        for(int num : numlist) {
            if(num % n == 0) {
                result[index++] = num;
            }
        }
        return result;
    }
}