class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;
        
        int maxX = board[0] / 2;
        int maxY = board[1] / 2;
        
        for (String key : keyinput) {
            if (key.equals("left")) {
                if (x > -maxX) {
                    x--;
                }
            } else if (key.equals("right")) {
                if (x < maxX) {
                    x++;
                }
            } else if (key.equals("up")) {
                if (y < maxY) {
                    y++;
                }
            } else if (key.equals("down")) {
                if (y > -maxY) {
                    y--;
                }
            }
        }
        
        return new int[] {x, y};
    }
}