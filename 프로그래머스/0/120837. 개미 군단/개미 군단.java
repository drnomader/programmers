class Solution {
    public int solution(int hp) {
        int generals = hp / 5;
        int remainder = hp % 5;
        
        int soldiers = remainder / 3;
        int workers = remainder % 3;
        
        return generals + soldiers + workers;
    }
}