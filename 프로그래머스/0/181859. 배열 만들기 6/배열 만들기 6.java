import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {

        Stack<Integer> stack = new Stack<>();
        
        for(int num : arr) {
            if(!stack.isEmpty() && num == stack.peek()) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }
        return stack.isEmpty() ? new int[] {-1} : stack.stream().mapToInt(i -> i).toArray();
    }
}