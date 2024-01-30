import java.util.*;
import java.util.function.BinaryOperator;

class Solution {
    private static final Map<Character, BinaryOperator<Integer>> OPERATORS;
        
    static {
        OPERATORS = new HashMap<>();
        OPERATORS.put('+', (a, b) -> a + b);
        OPERATORS.put('-', (a, b) -> a - b);
        OPERATORS.put('*', (a, b) -> a * b);
    }
    
    public int solution(String binomial) {
        
        String[] splitArr = binomial.split(" ");
        int a = Integer.parseInt(splitArr[0]);
        int b = Integer.parseInt(splitArr[2]);
        char op = splitArr[1].charAt(0);
        BinaryOperator<Integer> operation = OPERATORS.get(op);
        
        return operation.apply(a, b);
    }
}