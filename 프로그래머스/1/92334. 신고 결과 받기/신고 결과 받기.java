import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        int[] result = new int[id_list.length];
        
        Map<String, Integer> userIndexMap = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            userIndexMap.put(id_list[i], i);
        }
        
        Map<String, Set<String>> reportMap = new HashMap<>();
        
        Map<String, Integer> reportedCountMap = new HashMap<>();
        
        for (String log : report) {
            
            String[] parts = log.split(" ");
            String reporter = parts[0];
            String reported = parts[1];
            
            reportMap.putIfAbsent(reporter, new HashSet<>());
            
            if (reportMap.get(reporter).add(reported)) {
                reportedCountMap.put(reported, reportedCountMap.getOrDefault(reported, 0) + 1);
            }
        }
        
        Set<String> suspendedUsers = new HashSet<>();
        
        for (String user : reportedCountMap.keySet()) {
            if (reportedCountMap.get(user) >= k) {
                suspendedUsers.add(user);
            }
        }
        
        for (String reporter : reportMap.keySet()) {
            Set<String> reportedUsers = reportMap.get(reporter);
            for (String reported : reportedUsers) {
                if (suspendedUsers.contains(reported)) {
                    int index = userIndexMap.get(reporter);
                    result[index]++;
                }
            }
        }
        return result;
    }
}