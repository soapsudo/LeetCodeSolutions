package leetcode6;

import java.util.Arrays;

public class Solution implements Runnable{

    public static void main(String[] args){
        new Solution().run();
    }

    @Override
    public void run(){
        System.out.println(convert("ABC", 3));
    }

    private String convert(String s, int numRows) {

        int numCols = getNumCols(s.length(), numRows);
        char[][] conversion = new char[numRows][numCols];

        int row = 0, col = 0;
        boolean goingDown = true;

        for (int i = 0; i < s.length(); i++) {
            conversion[row][col] = s.charAt(i);

            if (goingDown) {
                if (row == numRows - 1) {
                    goingDown = false;
                    row--; col++;
                } else {
                    row++;
                }
            } else {
                if (row == 0) {
                    goingDown = true;
                    row++;
                } else {
                    row--; col++;
                }
            }
        }

        StringBuilder convertedString = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (conversion[i][j] != '\0') {
                    convertedString.append(conversion[i][j]);
                }
            }
        }

        return convertedString.toString();
    }

    private int getNumCols(int length, int numRows) {
        if (numRows == 1) return length;

        int cycleLength = 2 * numRows - 2;
        int fullCycles = length / cycleLength;
        int remainingChars = length % cycleLength;

        int numCols = fullCycles * (numRows - 1);

        if (remainingChars > 0) {
            numCols += (remainingChars <= numRows) ? 1 : (remainingChars - numRows + 1);
        }

        return numCols;
    }


}
