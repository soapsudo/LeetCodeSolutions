package leetcode5;

public class Solution implements Runnable{
    public static void main(String[] args){
        new Solution().run();
    }

    @Override
    public void run(){
        System.out.println(longestPalindrome("aaadsdfdfd"));
    }

    private String longestPalindrome(String s){
        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String palindromeCheck = s.substring(i, j);

                if(reverseString(palindromeCheck).equals(palindromeCheck) && palindromeCheck.length() >= longest.length()){
                    longest = palindromeCheck;
                }
            }
        }

        return longest;
    }

    private String reverseString(String s){
        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }

        return reverse;
    }
}
