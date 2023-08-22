package Algorithms._9_DynamicProgramming.SlidingWindow;

import java.util.Arrays;

public class FindSubArrayWithSum {
    public static void main(String[] args) {
        // Find sub-array with sum = 7
        int[] arr = new int[]{-1, 5, 1, 2, -2, 6, -2};
        findSubArrayWithSumPositive(arr, 5);
    }

    /**
     *
     * @param arr
     * @param total
     */
    public static void findSubArrayWithSumAll(int[] arr, int total) {

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

    /**
     * Find sub
     * @param arr
     * @param total
     */
    public static void findSubArrayWithSumPositive(int[] arr, int total) {

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
