class Solution {
    public String solution(String polynomial) {
        int x = 0, n = 0;
        
        for (String term : polynomial.split(" ")) {
            if (term.equals("+")) {
                continue;
            }
            
            if (term.contains("x")) {
                x += term.equals("x") ? 1 : Integer.parseInt(term.replace("x", ""));
            } else {
                n += Integer.parseInt(term);
            }
        }
        
        if (x == 0) {
            return String.valueOf(n);
        }
        
        if (n == 0) {
            return x == 1 ? "x" : x + "x";
        }
        
        return (x == 1 ? "x" : x + "x") + " + " + n;
    }
}