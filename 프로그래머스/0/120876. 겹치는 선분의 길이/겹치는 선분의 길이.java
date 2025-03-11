class Solution {
    public int solution(int[][] lines) {
        int answer = 0;

        for (int i = -100; i < 100; i++) {
            int count = 0;

            // 모든 선분을 확인하여 겹치는 개수 카운트
            for (int[] line : lines) {
                if (line[0] <= i && line[1] > i) {
                    count++;
                }
            }

            // 두 개 이상 겹치는 경우 answer 증가
            if (count > 1) answer++;
        }

        return answer;
    }
}