class Solution {
    public String[] solution(String[] quiz) {
        for(int i = 0; i < quiz.length; i++) {
            String[] formula = quiz[i].split(" ");
            int result = Integer.parseInt(formula[0]) + ( Integer.parseInt(formula[2]) * (formula[1].equals("+") ? 1 : -1) );
            quiz[i] = ( result == Integer.parseInt(formula[4]) ) ? "O" : "X";
        }
        return quiz;
    }
}