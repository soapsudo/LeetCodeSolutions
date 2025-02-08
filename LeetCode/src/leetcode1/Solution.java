package leetcode1;

import java.util.ArrayList;

public class Solution implements Runnable{

    public static void main(String[] args){
        new Solution().run();
    }

    @Override
    public void run(){
        twoSum(new int[]{1, 3, 4, 5}, 4);
    }

    public int[] twoSum(int[] nums, int target) {

        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i != j && nums[i] + nums[j] == target){
                    result.add(i);
                }
            }
        }

        int[] resultingArray = result.stream().mapToInt(i -> i).toArray();

        return resultingArray;

    }
}
