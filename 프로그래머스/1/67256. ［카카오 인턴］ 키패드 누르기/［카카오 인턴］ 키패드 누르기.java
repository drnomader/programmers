class Solution {

    private static final int[][] KEY_POSITION = {
            {3, 1},
            {0, 0},
            {0, 1},
            {0, 2},
            {1, 0},
            {1, 1},
            {1, 2},
            {2, 0},
            {2, 1},
            {2, 2} 
    };

    public String solution(int[] numbers, String hand) {

        StringBuilder result = new StringBuilder(numbers.length);

        int leftRow = 3;
        int leftCol = 0;

        int rightRow = 3;
        int rightCol = 2;

        boolean isRightHand = hand.equals("right");

        for (int number : numbers) {

            if (number == 1 || number == 4 || number == 7) {

                result.append('L');

                leftRow = KEY_POSITION[number][0];
                leftCol = KEY_POSITION[number][1];

                continue;
            }

            if (number == 3 || number == 6 || number == 9) {

                result.append('R');

                rightRow = KEY_POSITION[number][0];
                rightCol = KEY_POSITION[number][1];

                continue;
            }

            int targetRow = KEY_POSITION[number][0];
            int targetCol = KEY_POSITION[number][1];

            int leftDistance =
                    Math.abs(leftRow - targetRow)
                            + Math.abs(leftCol - targetCol);

            int rightDistance =
                    Math.abs(rightRow - targetRow)
                            + Math.abs(rightCol - targetCol);

            if (leftDistance < rightDistance) {

                result.append('L');

                leftRow = targetRow;
                leftCol = targetCol;
            }

            else if (leftDistance > rightDistance) {

                result.append('R');

                rightRow = targetRow;
                rightCol = targetCol;
            }

            else {

                if (isRightHand) {

                    result.append('R');

                    rightRow = targetRow;
                    rightCol = targetCol;

                } else {

                    result.append('L');

                    leftRow = targetRow;
                    leftCol = targetCol;
                }
            }
        }

        return result.toString();
    }
}