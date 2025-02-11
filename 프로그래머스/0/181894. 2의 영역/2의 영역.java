import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        int[] answer = {};
        List<Integer> idxList = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                idxList.add(i);
            }
        }
        if(idxList.size() == 0) {
            return new int[]{-1};
        }
        int startIdx = idxList.get(0);
        int endIdx = idxList.get(idxList.size() - 1);
        
        answer = Arrays.copyOfRange(arr, startIdx, endIdx + 1);
        return answer;
    }
}