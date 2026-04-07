import java.io.*;

class Solution {
    public String solution(String X, String Y) {

        int[] countX = new int[10];
        int[] countY = new int[10];
        
        for (int i = 0; i < X.length(); i++) {
            int digit = X.charAt(i) - '0';
            countX[digit]++;
        }
        
        for (int i = 0; i < Y.length(); i++) {
            int digit = Y.charAt(i) - '0';
            countY[digit]++;
        }
        
        StringBuilder result = new StringBuilder();
        
        for (int digit = 9; digit >= 0; digit--) {
            int commonCount = Math.min(countX[digit], countY[digit]);
            
            for (int i = 0; i < commonCount; i++) {
                result.append(digit);
            }
        }
        
        if (result.length() == 0) {
            return "-1";
        }
            
        if (result.charAt(0) == '0') {
            return "0";
        }
        
        return result.toString();
    }
}