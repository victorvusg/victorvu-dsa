package Algorithms._9_DynamicProgramming;

import java.util.Arrays;

public class SlidingWindow {
    public static void main(String[] args) {
        // Find sub-array with sum = 7
        int[] arr = new int[]{-1, 5, 1, 2, -2, 6, -2};
        findSubArrayWithSumMaster(arr, 5);
    }

    public static void findSubArrayWithSumMaster(int[] arr, int total) {

        int start = 0;
        int sum = 0;

        for (int end = 0; end < arr.length; end++) {
            sum = sum + arr[end];

            while (sum >= total && start <= end) {
                if (sum == total) {
                    System.out.println(Arrays.toString(new int[]{start, end}));
                }
                sum = sum - arr[start];
                start++;
            }
        }
    }

    public static void findSubArrayWithSum(int[] arr, int total) {

        int start = 0;
        int sum = 0;

        for (int end = 0; end < arr.length; end++) {
            sum = sum + arr[end];

            while (sum >= total && start <= end) {
                if (sum == total) {
                    System.out.println(Arrays.toString(new int[]{start, end}));
                }
                sum = sum - arr[start];
                start++;
            }
        }
    }

}
