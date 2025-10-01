import java.util.regex.*;

class Solution {
    public int solution(String my_string) {
        int sum = 0;
        
        Matcher matcher = Pattern.compile("\\d+").matcher(my_string);
        
        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group());
        }
        
        return sum;
    }
}