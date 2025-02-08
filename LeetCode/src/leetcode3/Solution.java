package leetcode3;

import java.util.HashMap;

public class Solution implements Runnable {

    public static void main(String[] args){
        Solution solution = new Solution();
        solution.run();
    }

    @Override
    public void run(){
        System.out.println(lengthOfLongestSubstring("fiqwerudsfmsok"));
    }

    private int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= start) {
                start = charIndexMap.get(currentChar) + 1;
            }

            charIndexMap.put(currentChar, end);

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

}
