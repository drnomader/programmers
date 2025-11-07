import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);
        
        int rows = park.length;
        int cols = park[0].length;
        
        for (int mIdx = mats.length - 1; mIdx >= 0; mIdx--) {
            int size = mats[mIdx];
            
            for (int i = 0; i <= rows - size; i++) {
                for (int j = 0; j <= cols - size; j++) {
                    boolean canPlace = true;
                    
                    for (int r = i; r < i + size; r++) {
                        for (int c = j; c < j + size; c++) {
                            if (!park[r][c].equals("-1")) {
                                canPlace = false;
                                break;
                            }
                        }
                        if (!canPlace) break;
                    }
                    
                    if (canPlace) {
                        return size;
                    }
                }
            }
        }
        
        return -1;
    }
}