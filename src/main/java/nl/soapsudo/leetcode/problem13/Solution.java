package nl.soapsudo.leetcode.problem13;

public class Solution implements Runnable {
    private final int[] romanFactors = new int[]{1000, 500, 100, 50, 10, 5, 1};
    private final char[] romanNumerals = new char[]{'M', 'D', 'C', 'L', 'X', 'V', 'I'};

    public static void main(String[] args) {
        new Solution().run();
    }

    @Override
    public void run() {
        System.out.println(romanToInt("LVIII"));
    }

    private int romanToInt(String s) {
        int conversion = 0;

        if (s.contains("IV")) {
            conversion += 4;
            s = s.replace("IV", "");
        }

        if (s.contains("IX")) {
            conversion += 9;
            s = s.replace("IX", "");
        }

        if (s.contains("XL")) {
            conversion += 40;
            s = s.replace("XL", "");
        }

        if (s.contains("XC")) {
            conversion += 90;
            s = s.replace("XC", "");
        }

        if (s.contains("CD")) {
            conversion += 400;
            s = s.replace("CD", "");
        }

        if (s.contains("CM")) {
            conversion += 900;
            s = s.replace("CM", "");
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < romanNumerals.length; j++) {
                if(s.charAt(i) == romanNumerals[j]){
                    conversion += romanFactors[j];
                    break;
                }
            }
        }

        return conversion;
    }


}
