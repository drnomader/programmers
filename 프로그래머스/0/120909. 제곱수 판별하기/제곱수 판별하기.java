import java.lang.Math;

class Solution {
    public int solution(int n) {
        return isPerfectSquare(n) ? 1 : 2;
    }
    
    private boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}