class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int a = sides[0];
        int b = sides[1];
        
        int min = Math.abs(a - b) + 1;
        int max = (a + b) - 1;
        
        answer = max - min + 1;
        
        return answer;
    }
}