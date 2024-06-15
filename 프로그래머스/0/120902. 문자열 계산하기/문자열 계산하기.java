class Solution {
    public int solution(String my_string) {
        
        String[] formula = my_string.split(" ");
        int num1 = Integer.parseInt(formula[0]);
        int num2 = Integer.parseInt(formula[2]);
        
        int answer = num1;
        for(int i = 1; i < formula.length; i++) {
            if(formula[i].equals("+")) {
                answer += Integer.parseInt(formula[i + 1]);
            } else if(formula[i].equals("-")) {
                answer -= Integer.parseInt(formula[i + 1]);
            } else {
                continue;
            }
        }
        return answer;
    }
}