class Solution {
    public int solution(int n, int w, int num) {
        int floor = (num - 1) / w;
        int pos = (num - 1) % w;
        
        int col = (floor % 2 == 0) ? pos : (w - 1 - pos);
        
        int totalFloors = (n + w - 1) / w;
        
        int count = 1;
        
        for (int f = floor + 1; f < totalFloors; f++) {
            int start = f * w + 1;
            int end = Math.min((f + 1) * w, n);
            
            int width = end - start + 1;
            
            int boxCol = (f % 2 == 0) ? col : (w - 1 - col);
            
            if (0 <= boxCol && boxCol < width) {
                count++;
            }
        }
        
        return count;
    }
}