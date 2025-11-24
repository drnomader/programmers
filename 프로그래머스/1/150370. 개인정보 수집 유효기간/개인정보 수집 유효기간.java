import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int todayTotal = convertToDays(today);
        
        Map<String, Integer> termMap = new HashMap<>();
        for (String term : terms) {
            String[] split = term.split(" ");
            String type = split[0];
            int month = Integer.parseInt(split[1]);
            termMap.put(type, month);
        }
        
        List<Integer> removeList = new ArrayList<>();
        
        for (int i = 0; i < privacies.length; i++) {
            String privacy = privacies[i];
            String[] split = privacy.split(" ");
            
            String date = split[0];
            String type = split[1];
            
            int startTotal = convertToDays(date);
            int month = termMap.get(type);
            int expireTotal = startTotal + (month * 28) - 1;
            
            if (expireTotal < todayTotal) {
                removeList.add(i + 1);
            }
        }
        
        int[] answer = new int[removeList.size()];
        for (int i = 0; i < removeList.size(); i++) {
            answer[i] = removeList.get(i);
        }
        
        return answer;
    }
    
    private int convertToDays(String date) {
        String[] split = date.split("\\.");
        
        int year = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int day = Integer.parseInt(split[2]);
        
        return year * 12 * 28 + month * 28 + day;
    }
}