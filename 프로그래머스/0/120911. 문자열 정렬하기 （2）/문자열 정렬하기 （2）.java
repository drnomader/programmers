import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String my_string_lower_case = my_string.toLowerCase();
        char[] char_array = my_string_lower_case.toCharArray();
        Arrays.sort(char_array);
        return new String(char_array);
    }
}