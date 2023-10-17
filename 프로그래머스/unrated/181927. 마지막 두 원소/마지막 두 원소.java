class Solution {
    public int[] solution(int[] num_list) {
        
        int size = num_list.length;
        int[] answer = new int[size + 1];
        System.arraycopy(num_list, 0, answer, 0, size);
        
        int lastNum = num_list[size - 1];
        int lastSecondNum = num_list[size - 2];
        
        if(lastNum > lastSecondNum) {
            answer[size] = lastNum - lastSecondNum;
        } else {
            answer[size] = lastNum * 2;
        }
        return answer;
    }
}