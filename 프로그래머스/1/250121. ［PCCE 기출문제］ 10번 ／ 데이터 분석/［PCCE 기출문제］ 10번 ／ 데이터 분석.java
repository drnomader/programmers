import java.util.*;
import java.util.stream.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        String[] columns = {"code", "date", "maximum", "remain"};
        List<String> columnList = Arrays.asList(columns);
        
        int filterIndex = columnList.indexOf(ext);
        int sortIndex = columnList.indexOf(sort_by);
        
        int[][] answer = Arrays.stream(data)
            .filter(row -> row[filterIndex] < val_ext)
            .sorted((row1, row2) -> Integer.compare(row1[sortIndex], row2[sortIndex]))
            .toArray(int[][]::new);
        
        return answer;
    }
}