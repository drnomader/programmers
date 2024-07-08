class Solution {
    public int solution(int[] array, int n) {
        int closest = array[0];
        
        for (int num : array) {
            int currentDiff = Math.abs(num - n);
            int closestDiff = Math.abs(closest - n);
            
            if (currentDiff < closestDiff) {
                closest = num;
            } else if (currentDiff == closestDiff && num < closest) {
                closest = num;
            }
        }
        return closest;
    }
}