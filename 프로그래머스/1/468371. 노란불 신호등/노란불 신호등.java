class Solution {
    public int solution(int[][] signals) {
        
       int lcm = 1;
        
        for (int[] s : signals) {
            int cycle = s[0] + s[1] + s[2];
            lcm = lcm(lcm, cycle);
        }
        
        for (int t = 1; t <= lcm; t++) {
            boolean ok = true;
            
            for (int[] s : signals) {
                int cycle = s[0] + s[1] + s[2];
                int time = (t - 1) % cycle;
                
                if (time < s[0] || time >= s[0] + s[1]) {
                    ok = false;
                    break;
                }
            }
            
            if (ok) return t;
        }
        
        return -1;
    }
    
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    
    private int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
}