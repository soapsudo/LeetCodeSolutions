package leetcode12;

import java.util.HashMap;

public class Solution implements Runnable {

    private final int[] romanFactors = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private final String[] romanNumerals = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static void main(String[] args) {
        new Solution().run();
    }

    @Override
    public void run() {
        System.out.println(intToRoman(3456));
    }

    private String intToRoman(int num) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < romanFactors.length; i++) {
            while (num >= romanFactors[i]) {
                num -= romanFactors[i];
                result.append(romanNumerals[i]);
            }
        }

        return result.toString();
    }

}
