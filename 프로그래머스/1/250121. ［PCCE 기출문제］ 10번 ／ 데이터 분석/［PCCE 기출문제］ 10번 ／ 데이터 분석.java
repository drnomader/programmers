import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String, Integer> colIndex = new HashMap<>();
        colIndex.put("code", 0);
        colIndex.put("date", 1);
        colIndex.put("maximum", 2);
        colIndex.put("remain", 3);
        
        int extIndex = colIndex.get(ext);
        int sortByIndex = colIndex.get(sort_by);
        
        List<int[]> filteredList = new ArrayList<>();
        for (int[] row : data) {
            if (row[extIndex] < val_ext) {
                filteredList.add(row);
            }
        }
        
        filteredList.sort((a, b) -> a[sortByIndex] - b[sortByIndex]);
        
        int[][] answer = new int[filteredList.size()][4];
        for (int i = 0; i < filteredList.size(); i++) {
            answer[i] = filteredList.get(i);
        }
        
        return answer;
    }
}