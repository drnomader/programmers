class Solution {
    public int[] solution(int[] numbers) {
        
        boolean[] possibleSum = new boolean[201];
        
        int resultCount = 0;
        
        for (int firstIndex = 0; firstIndex < numbers.length - 1; firstIndex++) {
            for (int secondIndex = firstIndex + 1; secondIndex < numbers.length; secondIndex++) {
                int sum = numbers[firstIndex] + numbers[secondIndex];
                
                if (!possibleSum[sum]) {
                    possibleSum[sum] = true;
                    resultCount++;
                }
            }
        }
        
        int[] result = new int[resultCount];
        
        int resultIndex = 0;
        
        for (int sum = 0; sum <= 200; sum++) {
            if (possibleSum[sum]) {
                result[resultIndex++] = sum;
            }
        }
        
        return result;
    }
}