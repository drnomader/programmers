class Solution {
    public int solution(int left, int right) {
        int resultSum = 0;
        
        for (int currentNumber = left; currentNumber <= right; currentNumber++) {
            int sqrtValue = (int) Math.sqrt(currentNumber);
            
            if (sqrtValue * sqrtValue == currentNumber) {
                resultSum -= currentNumber;
            } else {
                resultSum += currentNumber;
            }
        }
        return resultSum;
    }
}