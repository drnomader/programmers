class Solution {
    public int solution(String s) {
        int answer = 0;
        int lastNumber = 0;
        String[] tokens = s.split(" ");
        
        for (String token : tokens) {
            if (token.equals("Z")) {
                answer -= lastNumber;
            } else {
                lastNumber = Integer.parseInt(token);
                answer += lastNumber;
            }
        }
        
        return answer;
    }
}