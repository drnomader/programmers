class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        boolean[][] dangerZone = new boolean[n][n];

        int[] dx = {-1, -1, -1,  0, 0, 1, 1, 1};
        int[] dy = {-1,  0,  1, -1, 1, -1, 0, 1};

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                if (board[x][y] == 1) {
                    dangerZone[x][y] = true;

                    for (int dir = 0; dir < 8; dir++) {
                        int nx = x + dx[dir];
                        int ny = y + dy[dir];

                        if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                            dangerZone[nx][ny] = true;
                        }
                    }
                }
            }
        }

        int safeCount = 0;
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                if (!dangerZone[x][y]) {
                    safeCount++;
                }
            }
        }

        return safeCount;
    }
}