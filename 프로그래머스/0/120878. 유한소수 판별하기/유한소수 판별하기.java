import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int reducedDenominator = b / gcd(a, b);
        
        while (reducedDenominator != 1) {
            if (reducedDenominator % 2 == 0) {
                reducedDenominator /= 2;
            } else if (reducedDenominator % 5 == 0) {
                reducedDenominator /= 5;
            } else {
                return 2;
            }
        }
        return 1;
    }
    
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}