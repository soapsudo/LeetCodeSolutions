package leetcode9;

public class Solution implements Runnable{

    public static void main(String[] args){
        new Solution().run();
    }

    @Override
    public void run(){

    }

    private boolean isPalindrome(int x){

        String s = String.valueOf(x);

        return s.equals(reverseString(s));
    }

    private String reverseString(String s){

        String reversed = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }

        return reversed;
    }

}
