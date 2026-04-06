class Solution {
    public int solution(int[] number) {
        
        int trioCount = 0;
        
        int length = number.length;
        
        for (int firstIndex = 0; firstIndex < length - 2; firstIndex++) {
            for (int secondIndex = firstIndex + 1; secondIndex < length - 1; secondIndex++) {
                for (int thirdIndex = secondIndex + 1; thirdIndex < length; thirdIndex++) {
                    int sum = number[firstIndex] + number[secondIndex] + number[thirdIndex];
                    
                    if (sum == 0) {
                        trioCount++;
                    }
                }
             }
        }
        
        return trioCount;
    }
}