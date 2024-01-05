import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> pickedList = new ArrayList<>();
        for(int i = 0; i < num_list.length; i += n) {
            pickedList.add(num_list[i]);
        }
        return pickedList.stream().mapToInt(Integer::intValue).toArray();
    }
}