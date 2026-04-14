import java.io.*;

class Solution {
    public int solution(int n) {
        
        for (int divisor = 2; divisor < n; divisor++) {
            if (n % divisor == 1) {
                return divisor;
            }
        }
        
        return -1;
    }
}