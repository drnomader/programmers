class Solution {
    public int solution(String[] babbling) {
        
        int answer = 0;
        
        for (String word : babbling) {
            
            String converted = word;
            converted = converted.replace("aya", "1");
            converted = converted.replace("ye", "2");
            converted = converted.replace("woo", "3");
            converted = converted.replace("ma", "4");
            
            if (converted.contains("11") ||
                converted.contains("22") || 
                converted.contains("33") || 
                converted.contains("44")) {
                continue;
            }
            
            boolean isValid = true;
            
            for (int i = 0; i < converted.length(); i++) {
                
                char c = converted.charAt(i);
                
                if (c < '1' || c > '4') {
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) {
                answer++;
            }
        }
        
        return answer;
        
    }
}