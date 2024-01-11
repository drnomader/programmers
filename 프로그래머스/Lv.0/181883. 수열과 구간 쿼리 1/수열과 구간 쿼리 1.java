class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int[] answer = arr;
        int s; int e;
        
        for(int i = 0; i < queries.length; i++) {
            s = queries[i][0];
            e = queries[i][1];
            
            for(int j = 0; j < arr.length; j++) {
                if(s <= j && j <= e) {
                    answer[j] += 1;
                    continue;
                }
            }
        }
        return answer;
    }
}