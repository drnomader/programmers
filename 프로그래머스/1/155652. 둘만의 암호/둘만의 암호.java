class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        
        boolean[] isSkip = new boolean[26];
        
        for (char c : skip.toCharArray()) {
            isSkip[c - 'a'] = true;
        }
        
        for (char ch : s.toCharArray()) {
            int moveCount = 0;
            int current = ch - 'a';
            
            while (moveCount < index) {
                current++;
                
                if (current > 25) {
                    current = 0;
                }
                
                if (isSkip[current]) {
                    continue;
                }
                
                moveCount++;
            }
            
            answer.append((char) (current + 'a'));
        }
        
        return answer.toString();
    }
}