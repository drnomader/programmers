class Solution {
    public int solution(String myString, String pat) {
        
        int count = 0;
        int pos = myString.indexOf(pat);
        
        while(pos > -1) {
            count++;
            pos = myString.indexOf(pat, pos + 1);
        }
        return count;
    }
}