class Solution {
    public int solution(String number) {
        
        int sum = 0;
        String[] numberArray = number.split("");
        
        for(int i = 0; i < numberArray.length; i++) {
            sum += Integer.parseInt(numberArray[i]);
        }
        return sum % 9;
    }
}