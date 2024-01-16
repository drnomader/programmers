class Solution {
    public int solution(int[] num_list) {
        
        int add = 0;
        int mul = 1;
        int answer = 0;
        
        for(int i : num_list) {
            if(num_list.length >= 11) {
                add += i;
                answer = add;
            } else {
                mul *= i;
                answer = mul;
            }
        }
        return answer;
    }
}