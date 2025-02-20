package leetcode43;

public class Solution implements Runnable{

    public static void main(String[] args){
        new Solution().run();
    }

    @Override
    public void run(){
        System.out.println(multiply("2", "3"));
    }

    private String multiply(String num1, String num2){
        return String.valueOf(Integer.valueOf(num1) * Integer.valueOf(num2));
    }
}
