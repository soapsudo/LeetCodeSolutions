package leetcode11;

import java.util.Arrays;

public class Solution implements Runnable{

    public static void main(String[] args){
        new Solution().run();
    }

    @Override
    public void run(){
        System.out.println(maxArea(new int[]{1, 2, 4, 3}));
    }

    private int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int currentArea = (right - left) * Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

}
