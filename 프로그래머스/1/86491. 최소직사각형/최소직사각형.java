class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            int width = sizes[i][0];
            int height = sizes[i][1];
            
            int longerSide = Math.max(width, height);
            int shorterSide = Math.min(width, height);
            
            maxWidth = Math.max(maxWidth, longerSide);
            maxHeight = Math.max(maxHeight, shorterSide);
        }
        
        return maxWidth * maxHeight;
    }
}