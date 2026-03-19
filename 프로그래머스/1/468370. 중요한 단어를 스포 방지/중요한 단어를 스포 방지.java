import java.util.*;

class Solution {
    public int solution(String message, int[][] spoiler_ranges) {
        
        int n = message.length();
        
        List<String> words = new ArrayList<>();
        List<int[]> idx = new ArrayList<>();
        
        for (int i = 0; i < n; ) {
            if (message.charAt(i) == ' ') {
                i++;
                continue;
            }
            
            int s = i;
            while (i < n && message.charAt(i) != ' ') {
                i++;
            }
            
            words.add(message.substring(s, i));
            idx.add(new int[]{s, i -1});
        }
        
        int m = words.size();
        
        int[] belong = new int[n];
        Arrays.fill(belong, -1);
        
        for (int i = 0; i < m; i++) {
            int s = idx.get(i)[0], e = idx.get(i)[1];
            for (int j = s; j <= e; j++) {
                belong[j] = i;
            }
        }
        
        int[] remain = new int[m];
        boolean[] hasSpo = new boolean[m];
        
        for (int[] r : spoiler_ranges) {
            for (int i = r[0]; i <= r[1]; i++) {
                int w = belong[i];
                if (w != -1) {
                    remain[w]++;
                    hasSpo[w] = true;
                }
            }
        }
        
        Set<String> normal = new HashSet<>();
        for (int i = 0; i < m; i++) {
            if (!hasSpo[i]) {
                normal.add(words.get(i));
            }
        }
        
        boolean[] counted = new boolean[m];
        Set<String> used = new HashSet<>();
        
        int ans = 0;
        
        for (int[] r : spoiler_ranges) {
            for (int i = r[0]; i <= r[1]; i++) {
                int w = belong[i];
                if (w == -1) {
                    continue;
                }
                
                if (--remain[w] == 0) {
                     if (hasSpo[w] && !normal.contains(words.get(w)) && used.add(words.get(w))) {
                        ans++;
                    }
                }
            }
        }
        
        return ans;
    }
}