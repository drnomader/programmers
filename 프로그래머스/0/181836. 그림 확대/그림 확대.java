import java.util.Arrays;

class Solution {
    public String[] solution(String[] picture, int k) {
        int rows = picture.length;
        int cols = picture[0].length(); // 조건 : 모든 picture의 원소의 길이는 같습니다.

        String[] enlargedPicture = new String[rows * k];

        for (int i = 0; i < rows * k; i++) {
            StringBuilder row = new StringBuilder();

            for (int j = 0; j < cols * k; j++) {
                char pixel = picture[i / k].charAt(j / k);
                row.append(String.valueOf(pixel));
            }
            enlargedPicture[i] = row.toString();
        }
        return enlargedPicture;
    }
}