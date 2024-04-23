import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String lower_case = my_string.toLowerCase();
        char[] char_array = lower_case.toCharArray();
        Arrays.sort(char_array);
        return new String(char_array);
    }
}