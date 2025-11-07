import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int n = friends.length;
        
        Map<String, Integer> idx = new HashMap<>();
        for (int i = 0; i < n; i++) {
            idx.put(friends[i], i);
        }
        
        int[][] giftCount = new int[n][n];
        
        int[] give = new int[n];
        int[] receive = new int[n];
        
        for (String g : gifts) {
            String[] pair = g.split(" ");
            
            int giver = idx.get(pair[0]);
            int receiver = idx.get(pair[1]);
            
            giftCount[giver][receiver]++;
            give[giver]++;
            receive[receiver]++;
        }
        
        int[] giftIndex = new int[n];
        for (int i = 0; i < n; i++) {
            giftIndex[i] = give[i] - receive[i];
        }
        
        int[] nextMonthReceive = new int[n];
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (giftCount[i][j] != giftCount[j][i]) {
                    if (giftCount[i][j] > giftCount[j][i]) {
                        nextMonthReceive[i]++;
                    } else {
                        nextMonthReceive[j]++;
                    }
                } else {
                    if (giftIndex[i] > giftIndex[j]) {
                        nextMonthReceive[i]++;
                    } else if (giftIndex[i] < giftIndex[j]) {
                        nextMonthReceive[j]++;
                    }
                }
            }
        }
        
        int maxReceive = 0;
        for (int val : nextMonthReceive) {
            maxReceive = Math.max(maxReceive, val);
        }
        
        return maxReceive;
    }
}