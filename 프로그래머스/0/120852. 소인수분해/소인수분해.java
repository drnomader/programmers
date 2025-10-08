import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> factors = new LinkedHashSet<>();
        
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }
        
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        
        if (n > 2) {
            factors.add(n);
        }
        
        return factors.stream()
            .mapToInt(i -> i)
            .toArray();
    }
}