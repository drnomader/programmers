class Solution {
    public String[] solution(String[] quiz) {
        
        String[][] formula = new String[quiz.length][5];
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++) {
            formula[i] = quiz[i].split(" ");
        
            int num1 = Integer.parseInt(formula[i][0]);
            int num2 = Integer.parseInt(formula[i][2]);
            int result_num = Integer.parseInt(formula[i][4]);
            String operator = formula[i][1];
        
            if(operator.equals("+")) {
                answer[i] = (num1 + num2) == result_num ? "O" : "X";
            } else if(operator.equals("-")) {
                answer[i] = (num1 - num2) == result_num ? "O" : "X";
            }
        }
        return answer;
    }
}