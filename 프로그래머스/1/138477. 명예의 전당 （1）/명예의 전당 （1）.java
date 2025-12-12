import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        PriorityQueue<Integer> hall = new PriorityQueue<>();
        
        for (int day = 0; day < score.length; day++) {
            int todayScore = score[day];
            
            if (hall.size() < k) {
                hall.offer(todayScore);
            } else {
                if (todayScore > hall.peek()) {
                    hall.poll();
                    hall.offer(todayScore);
                }
            }
            
            answer[day] = hall.peek();
        }
        
        return answer;
    }
}