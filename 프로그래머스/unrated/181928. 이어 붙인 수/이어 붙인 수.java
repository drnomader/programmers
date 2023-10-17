class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String evenValue = "";
        String oddValue = "";
        
        for(int num : num_list) {
            if(num % 2 == 0) {
                evenValue += num;
            } else {
                oddValue += num;
            }
        }
        answer = Integer.parseInt(evenValue) + Integer.parseInt(oddValue);
        return answer;
    }
}