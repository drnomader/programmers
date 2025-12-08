class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        int[] lastIndex = new int[26];
        for (int i = 0; i < 26; i++) {
            lastIndex[i] = -1;
        }
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int idx = c - 'a';
            
            if (lastIndex[idx] == -1) {
                answer[i] = -1;
            } else {
                answer[i] = i - lastIndex[idx];
            }
            
            lastIndex[idx] = i;
        }
        
        return answer;
    }
}