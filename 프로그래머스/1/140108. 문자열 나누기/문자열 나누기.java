class Solution {
    public int solution(String s) {
        int answer = 0;
        
        char x = s.charAt(0);
        
        int countX = 0;
        int countNotX = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == x) {
                countX++;
            } else {
                countNotX++;
            }
            
            if (countX == countNotX) {
                answer++;
                
                if (i + 1 < s.length()) {
                    x = s.charAt(i + 1);
                }
                
                countX = 0;
                countNotX = 0;
            }
        }
        
        if (countX != 0 || countNotX != 0) {
            answer++;
        }
        
        return answer;
    }
}