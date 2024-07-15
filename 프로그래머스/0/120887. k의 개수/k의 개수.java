class Solution {
    public int solution(int i, int j, int k) {
        
        int result = 0;
        String kStr = "" + k;
        
        for (int n = i; n <= j; n++) {
            String nStr = "" + n;
            result += nStr.length() - nStr.replace(kStr, "").length();
        }
        return result;
    }
}