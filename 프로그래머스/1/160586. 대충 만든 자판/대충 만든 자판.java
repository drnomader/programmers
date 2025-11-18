import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        
        Map<Character, Integer> minPresses = new HashMap<>();
        
        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char character = key.charAt(i);
                
                int currentMin = minPresses.getOrDefault(character, Integer.MAX_VALUE);
                
                if (i + 1 < currentMin) {
                    minPresses.put(character, i + 1);
                }
            }
        }
        
        int[] result = new int[targets.length];
        
        for (int j = 0; j < targets.length; j++) {
            String target = targets[j];
            int totalPresses = 0;
            boolean possible = true;
            
            for (int k = 0; k < target.length(); k++) {
                char character = target.charAt(k);
                
                if (minPresses.containsKey(character)) {
                    totalPresses += minPresses.get(character);
                } else {
                    possible = false;
                    break;
                }
            }
            
            if (possible) {
                result[j] = totalPresses;
            } else {
                result[j] = -1;
            }
        }
        
        return result;
    }
}