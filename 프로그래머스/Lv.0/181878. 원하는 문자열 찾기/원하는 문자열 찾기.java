class Solution {
    public int solution(String myString, String pat) {
        String upperMyString = myString.toUpperCase();
        String upperPat = pat.toUpperCase();
        return upperMyString.contains(upperPat) ? 1 : 0;
    }
}