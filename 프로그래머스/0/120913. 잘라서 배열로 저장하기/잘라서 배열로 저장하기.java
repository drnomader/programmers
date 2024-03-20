import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String my_str, int n) {
        
        List<String> resultList = new ArrayList<>();
        int length = my_str.length();
        
        for(int i = 0; i < length; i += n) {
            resultList.add(my_str.substring(i, Math.min(i + n, length)));
        }
        return resultList.toArray(new String[0]);
    }
}