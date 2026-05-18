import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
         int removedDollCount = 0;
        
        Deque<Integer> basket = new ArrayDeque<>();
        
        for (int move : moves) {
            int column = move - 1;
             
            for (int row = 0; row < board.length; row++) {
                int currentDoll = board[row][column];
                
                if (currentDoll == 0) {
                    continue;
                }
                
                board[row][column] = 0;
                
                if (!basket.isEmpty() && basket.peek() == currentDoll) {
                    basket.pop();
                    removedDollCount += 2;
                } else {
                    basket.push(currentDoll);
                }
                break;
            }
        }
        return removedDollCount;
    }
}