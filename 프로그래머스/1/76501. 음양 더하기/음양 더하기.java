class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int totalSum = 0;
        
        for (int index = 0; index < absolutes.length; index++) {
            int currentValue = absolutes[index];
            if (signs[index]) {
                totalSum += currentValue;
            } else {
                totalSum -= currentValue;
            }
        }
        
        return totalSum;
    }
}