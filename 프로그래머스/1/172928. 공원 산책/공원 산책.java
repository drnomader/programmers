class Solution {
    public int[] solution(String[] park, String[] routes) {
        int H = park.length;
        int W = park[0].length();
        
        int startX = 0, startY = 0;
        
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (park[i].charAt(j) == 'S') {
                    startX = i;
                    startY = j;
                    break;
                }
            }
        }
        
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        String directions = "NSWE";
        
        for (String route : routes) {
            String[] parts = route.split(" ");
            char direction = parts[0].charAt(0);
            int distance = Integer.parseInt(parts[1]);
            
            int dirIndex = directions.indexOf(direction);
            
            int newX = startX;
            int newY = startY;
            
            for (int i = 0; i < distance; i++) {
                newX += dx[dirIndex];
                newY += dy[dirIndex];
                
                if (newX < 0 || newX >= H || newY < 0 || newY >= W) {
                    newX = startX;
                    newY = startY;
                    break;
                }
                
                if (park[newX].charAt(newY) == 'X') {
                    newX = startX;
                    newY = startY;
                    break;
                }
            }
            
            if (newX != startX || newY != startY) {
                startX = newX;
                startY = newY;
            }
        }
        
        return new int[] {startX, startY};
    }
}