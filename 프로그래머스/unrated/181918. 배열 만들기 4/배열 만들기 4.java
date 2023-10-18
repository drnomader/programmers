import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> temp = new ArrayList<>();
        int i = 0;
        
        while(i < arr.length) {
            if(temp.isEmpty()) {
                temp.add(arr[i]);
                i++;
            } else {
                int last = temp.get(temp.size() - 1);
                if(!temp.isEmpty()) {
                    if(last < arr[i]) {
                        temp.add(arr[i]);
                        i++;
                    } else if(last >= arr[i]) {
                        temp.remove(temp.size() - 1);
                    }
                }
            }
        }
        int[] stk = new int[temp.size()];
        
        for(int k = 0; k < temp.size(); k++) {
            stk[k] = temp.get(k).intValue();
        }
        return stk;
    }
}