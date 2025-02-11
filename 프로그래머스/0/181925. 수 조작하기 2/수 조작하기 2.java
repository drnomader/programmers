class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int first = 0;
        int second = 0;
        
        for(int i = 0; i < numLog.length - 1; i++) {
            first = numLog[i];
            second = numLog[i + 1];
            
            if(first + 1 == second) {
                answer += "w";
            } else if(first - 1 == second) {
                answer += "s";
            } else if(first + 10 == second) {
                answer += "d";
            } else if(first - 10 == second) {
                answer += "a";
            }
        }
        return answer;
    }
}