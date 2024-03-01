import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public int solution(String num_str) {
        int sum = 0;

        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(num_str);

        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group());
        }
        return sum;
    }
}