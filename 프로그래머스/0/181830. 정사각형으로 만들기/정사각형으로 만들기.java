import java.util.Arrays;

class Solution {
    public int[][] solution(int[][] arr) {
        
        int rows = arr.length;
        int cols = 0;
        for(int[] row : arr) {
            cols = Math.max(cols, row.length);
        }
        
        int[][] newArr = new int[Math.max(rows, cols)][Math.max(rows, cols)];
        
        for(int i = 0; i < newArr.length; i++) {
            if(i < arr.length) {
                for(int j = 0; j < newArr[i].length; j++) {
                    if(j < arr[i].length) {
                        newArr[i][j] = arr[i][j];
                    } else {
                        newArr[i][j] = 0;
                    }
                }
            } else {
                Arrays.fill(newArr[i], 0);
            }
        }
        return newArr;
    }
}