class Solution {
    public int solution(int[] numbers) {
        int totalSum = 45;
        int currentSum = 0;
        
        for (int number : numbers) {
            currentSum += number;
        }
        
        int missingSum = totalSum - currentSum;
        
        return missingSum;
    }
}