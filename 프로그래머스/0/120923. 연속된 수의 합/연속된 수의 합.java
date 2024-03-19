class Solution {
    public int[] solution(int num, int total) {
        
        int first = (total - (num * (num - 1) / 2)) / num;
        int[] result = new int[num];
        
        for(int i = 0; i < num; i++) {
            result[i] = first + i;
        }
        return result;
    }
}