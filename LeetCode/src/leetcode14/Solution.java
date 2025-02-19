package leetcode14;

public class Solution implements Runnable {

    public static void main(String[] args) {
        new Solution().run();
    }

    @Override
    public void run() {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    private String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        StringBuilder longestPrefix = new StringBuilder();
        int minLength = Integer.MAX_VALUE;

        for (String str : strs) {
            if (str.length() < minLength) {
                minLength = str.length();
            }
        }

        for (int i = 0; i < minLength; i++) {
            char currentChar = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != currentChar) {
                    return longestPrefix.toString();
                }
            }
            longestPrefix.append(currentChar);
        }

        return longestPrefix.toString();
    }
}
