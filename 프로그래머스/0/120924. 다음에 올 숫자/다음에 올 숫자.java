class Solution {
    public int solution(int[] common) {
        int n = common.length;        
        int commonDifferenceOrRatio = common[1] - common[0];
        
        if (common[n - 1] - common[n - 2] == commonDifferenceOrRatio) {
            return common[n - 1] + commonDifferenceOrRatio;
        } else {
            int ratio = common[n - 1] / common[n - 2];
            return common[n - 1] * ratio;
        }
    }
}