class Solution {
    public String solution(String[] survey, int[] choices) {
        
        int[] personalityScore = new int[26];
        
        for (int i = 0; i < survey.length; i++) {
            char disagreeType = survey[i].charAt(0);
            char agreeType = survey[i].charAt(1);
            
            int choice = choices[i];
            
            if (choice == 4) continue;
            
            int score = Math.abs(choice - 4);
            
            if (choice < 4) {
                personalityScore[disagreeType - 'A'] += score;
            } else {
                personalityScore[agreeType - 'A'] += score;
            }
        }
        
        StringBuilder result = new StringBuilder();
        
        char[][] indicators = {
            {'R', 'T'},
            {'C', 'F'},
            {'J', 'M'},
            {'A', 'N'}
        };
        
        for (char[] pair : indicators) {
            char first = pair[0];
            char second = pair[1];
            
            int firstScore = personalityScore[first - 'A'];
            int secondScore = personalityScore[second - 'A'];
            
            if (firstScore > secondScore) {
                result.append(first);
            } else if (firstScore < secondScore) {
                result.append(second);
            } else {
                result.append(first);
            }
        }
        
        return result.toString();
    }
}