import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Set<Integer> winNumSet = new HashSet<>();
        
        for (int number : win_nums) {
            winNumSet.add(number);
        }
        
        int zeroCount = 0;
        
        int matchCount = 0;
        
        for (int lottoNumber : lottos) {
            if (lottoNumber == 0) {
                zeroCount++;
            }
            else if (winNumSet.contains(lottoNumber)) {
                matchCount++;
            }
        }
        
        int maxMatch = matchCount + zeroCount;
        
        int minMatch = matchCount;
        
        int highetRank = calculateRank(maxMatch);
        int lowestRank = calculateRank(minMatch);
        
        return new int[]{highetRank, lowestRank};
    }
    
    private int calculateRank(int matchCount) {
        if (matchCount >= 2) {
            return 7 - matchCount;
        }
        
        return 6;
    }
}