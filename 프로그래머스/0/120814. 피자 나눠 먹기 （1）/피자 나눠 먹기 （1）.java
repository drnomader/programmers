class Solution {
    public int solution(int n) {
        int slicesPerPizza = 7;
        int answer = n / slicesPerPizza;
        
        if (n % slicesPerPizza != 0) {
            answer++;
        }
        
        return answer;
    }
}