class Solution {
    public int solution(int[] a, int[] b) {
        int dotProductSum = 0;
        
        for (int index = 0; index < a.length; index++) {
            dotProductSum += a[index] * b[index];
        }
        
        return dotProductSum;
    }
}