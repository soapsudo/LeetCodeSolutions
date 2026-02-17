package nl.soapsudo.leetcode.problem8;

public class Solution implements Runnable {

    public static void main(String[] args) {
        new Solution().run();
    }

    @Override
    public void run() {
        System.out.print(myAtoi("20000000000000000000"));
    }

    private int myAtoi(String s) {

        if(s.trim().isEmpty()){
            return 0;
        }

        int positivity = determinePositivity(s.trim());
        long comparison = 0;

        s = s.trim();
        s = removePrefix(s);
        s = readIn(s);
        s = removeLeadingZeroes(s);

        if(s.length() > 19){
            return 0;
        }

        System.out.println(s);

        if (!s.isEmpty()) {
            comparison = Long.parseLong(s) * positivity;

            if (comparison <= (long) Integer.MIN_VALUE) {
                return -2147483648;
            }
            if (comparison >= (long) Integer.MAX_VALUE) {
                return 2147483647;
            }
        }

        return (int) comparison;

    }

    private int determinePositivity(String s) {

        if (s.charAt(0) == '-') {
            return -1;
        }

        return 1;
    }

    private String readIn(String s) {

        String read = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                read += s.charAt(i);
            } else {
                break;
            }
        }

        return read;
    }

    private String removeLeadingZeroes(String s) {

        String formattedString = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                formattedString = s.substring(i);
                break;
            }
        }

        return formattedString;
    }

    private String removePrefix(String s) {
        if (s.startsWith("+") || s.startsWith("-")) {
            s = s.substring(1);
        }

        return s;
    }

}
