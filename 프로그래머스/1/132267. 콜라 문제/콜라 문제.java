class Solution {
    public int solution(int a, int b, int n) {
        
        int answer = 0;
        
        while (n >= a) {
            int newCola = (n / a) * b;
            
            int remain = n % a;
            
            answer += newCola;
            
            n = remain + newCola;
        }
        
        return answer;
    }
}