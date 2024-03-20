class Solution {
    public int solution(int M, int N) {
        int horizontalCuts = M - 1;
        int verticalCuts = M * (N - 1);
        return horizontalCuts + verticalCuts;
    }
}