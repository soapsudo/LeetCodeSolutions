package leetcode4;

import java.util.Arrays;

public class Solution implements Runnable{

    private int[] array;

    public static void main(String[] args){
        new Solution().run();
    }

    @Override
    public void run(){

        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};

        System.out.println(findMedianSortedArrays(nums1, nums2));

    }

    private double findMedianSortedArrays(int[] nums1, int[] nums2){

        int[] merged = new int[nums1.length + nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            merged[i] = nums1[i];
        }

        for (int i = 0; i < nums2.length; i++) {
            merged[i + nums1.length] = nums2[i];
        }

        Arrays.sort(merged);

        System.out.print(Arrays.toString(merged));

        if(merged.length % 2 != 0){
            return (double) merged[(merged.length - 1) / 2];
        }else{
            int index1 = (merged.length - 1) / 2;
            int index2 = (merged.length + 1) / 2;

            return (double) (merged[index1] + merged[index2]) / 2;
        }
    }
}
