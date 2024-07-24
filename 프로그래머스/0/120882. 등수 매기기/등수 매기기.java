import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[][] score) {
        int n = score.length;
        int[] ranks = new int[n];
        
        double[] averages = new double[n];
        for (int i = 0; i < n; i++) {
            averages[i] = (score[i][0] + score[i][1]) / 2.0;
        }
        
        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (averages[j] > averages[i]) {
                    rank++;
                }
            }
            ranks[i] = rank;
        }
        return ranks;
    }
}