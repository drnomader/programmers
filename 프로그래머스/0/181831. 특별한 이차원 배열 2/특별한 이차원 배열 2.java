class Solution {
    public int solution(int[][] arr) {
        int n = arr.length;
        
        if(n == 0) {
            return 1;
        }
        
        if(n != arr[0].length) {
            return 0;
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i][j] != arr[j][i]) {
                    return 0;
                }
            }
        }
        return 1;
    }
}