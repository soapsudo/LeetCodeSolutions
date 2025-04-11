package leetcode2843;

public class Solution implements Runnable{

    public static void main(String[] args){
        new Solution().run();
    }

    @Override
    public void run(){
        System.out.println(countSymmetricIntegers(1200, 1230));
    }

    private int countSymmetricIntegers(int low, int high){

        int count = 0;

        for (int i = low; i <= high; i++) {
            if(isSymmetric(i)) count++;

        }

        return count;
    }

    private boolean isSymmetric(int number){

        String s = String.valueOf(number);

        int length = String.valueOf(number).length();
        int sum1, sum2;
        sum1 = sum2 = 0;

        if(length % 2 != 0) return false;

        for (int i = 0; i < length / 2; i++) {
            sum1 += Integer.valueOf(s.charAt(i));
        }

        for (int i = length / 2; i < length; i++) {
            sum2 += Integer.valueOf(s.charAt(i));
        }

        return sum1 == sum2;
    }
}
