class Solution {
    public String solution(String my_string, int s, int e) {
        String extractedStr = my_string.substring(s, e + 1);
        StringBuffer sb = new StringBuffer(extractedStr);
        String reversedStr = sb.reverse().toString();
        my_string = my_string.replaceAll(extractedStr, reversedStr);
        return my_string;
    }
}