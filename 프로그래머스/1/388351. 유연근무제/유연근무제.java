class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int n = schedules.length;
        int answer = 0;
        
        for (int i = 0; i < n; i++) {
            
            int hope = schedules[i];
            int hopeH = hope / 100;
            int hopeM = hope % 100;
            int limitH = hopeH;
            int limitM = hopeM + 10;
            
            if (limitM >= 60) {
                limitH += 1;
                limitM -= 60;
            }
            int limit = limitH * 100 + limitM;
            
            boolean success = true;
            for (int j = 0; j < 7; j++) {
                int day = (startday + j - 1) % 7 + 1;
                if (day == 6 || day == 7) continue;
                if (timelogs[i][j] > limit) {
                    success = false;
                    break;
                }
            }
            
            if (success) answer++;
        }
        
        return answer;
    }
}