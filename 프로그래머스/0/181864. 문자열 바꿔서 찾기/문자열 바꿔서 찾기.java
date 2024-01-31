class Solution {
    public int solution(String myString, String pat) {
        return myString
            .replace("A", "X")
            .replaceAll("B", "A")
            .replaceAll("X", "B")
            .contains(pat) ? 1 : 0;
    }
}