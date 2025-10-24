class Solution {
    public String solution(int age) {
        String ageStr = String.valueOf(age);
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < ageStr.length(); i++) {
            int digit = ageStr.charAt(i) - '0';
            result.append((char) ('a' + digit));
        }
        
        return result.toString();
    }
}