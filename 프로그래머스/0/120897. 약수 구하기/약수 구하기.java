import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int n) {
        
        ArrayList<Integer> divisors = new ArrayList<>();
        
        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                divisors.add(i);
                if(i != (n / i)) {
                    divisors.add(n / i);
                }
            }
        }
        Collections.sort(divisors);
        
        int[] result = new int[divisors.size()];
        for(int i = 0; i < divisors.size(); i++) {
            result[i] = divisors.get(i);
        }
        return result;
    }
}