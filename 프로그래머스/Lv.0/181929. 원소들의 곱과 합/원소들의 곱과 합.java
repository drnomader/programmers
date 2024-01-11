class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multiplied = 1;
        int sumSquared = 0;
        
        for(int num : num_list) {
            multiplied *= num;
            sumSquared += num;
        }
        sumSquared *= sumSquared;
        
        answer = multiplied < sumSquared ? 1 : 0;
        return answer;
    }
}