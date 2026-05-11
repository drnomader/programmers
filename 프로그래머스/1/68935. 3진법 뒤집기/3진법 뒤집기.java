class Solution {
    public int solution(int n) {
        int convertedDecimal = 0;
        
        while (n > 0) {
            int remainder = n % 3;
            
            convertedDecimal = convertedDecimal * 3 + remainder;
            
            n /= 3;
        }
        
        return convertedDecimal;
    }
}