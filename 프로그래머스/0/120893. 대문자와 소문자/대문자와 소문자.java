class Solution {
    public String solution(String my_string) {
        
        char[] chars = my_string.toCharArray();
        
        for(int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }
}