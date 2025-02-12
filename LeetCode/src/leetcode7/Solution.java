package leetcode7;

public class Solution implements Runnable{

    public static void main(String[] args){
        new Solution().run();
    }

    @Override
    public void run(){
        System.out.println(reverse(1534236469));
    }
    
    public int reverse(int x){

        if(x <= -2147483648 || x >= 2147483647){
            return 0;
        }

        String toReverse = String.valueOf(makePositive(x));
        String reversed = determinePrefix(x);

        toReverse = stripZeroes(toReverse);

        for (int i = toReverse.length() - 1; i >= 0; i--) {
            reversed += toReverse.charAt(i);
        }

        if(Long.valueOf(reversed) <= -2147483648 || Long.valueOf(reversed) >= 2147483647){
            return 0;
        }

        return Integer.parseInt(reversed);
    }

    private String determinePrefix(int x){

        String withPrefix;

        if(x < 0){
            withPrefix = "-";
        }else{
            withPrefix = "";
        }

        return withPrefix;
    }

    private int makePositive(int x){
        if(x < 0){
            return x * -1;
        }
        return x;
    }

    private String stripZeroes(String toStrip){

        String stripped = "";

        for (int i = toStrip.length() - 1; i >= 0; i--) {
            if(toStrip.charAt(i) == '0'){
                stripped = toStrip.substring(0, i);
            }else{
                break;
            }
        }

        if(stripped.isEmpty()){
            return toStrip;
        }

        return stripped;
    }
    
}
