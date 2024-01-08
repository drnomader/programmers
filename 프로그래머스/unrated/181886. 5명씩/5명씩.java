class Solution {
    public String[] solution(String[] names) {
        
        int idx = 0;
        int length = names.length % 5 == 0 ? names.length / 5 : names.length / 5 + 1;
        String[] answer = new String[length];
        
        for(int i = 0; i < names.length; i += 5) {
            if(i % 5 == 0) {
                answer[idx++] = names[i];
            }
        }
        return answer;
    }
}