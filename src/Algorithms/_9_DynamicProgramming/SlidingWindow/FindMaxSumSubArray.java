package Algorithms._9_DynamicProgramming.SlidingWindow;

import java.util.Arrays;

/**
 * Kadane's Algorithms
 */
public class FindMaxSumSubArray {
    public static void main(String[] args) {
        //
        int[] array = new int[]{-1, 5, 1, 2, -2, 6, -1, 6, -5, 5, 1}; // length = 9
        System.out.println(findSubArrayHasMaxSum(array));
    }

    public static int findMaxSumSubArray(int[] arr) {

        int max = arr[0];

        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            max = Math.max(currentSum, max);
        }

        return max;
    }

    public static String findSubArrayHasMaxSum(int[] arr) {
        int max = arr[0];
        int currentSum = arr[0];

        int maxStart = 0;
        int maxEnd = 0;

        int currentStart = 0;

        for (int currentEnd = 1; currentEnd < arr.length; currentEnd++) {
            currentSum += arr[currentEnd];
            if (arr[currentEnd] > currentSum) {
                currentStart = currentEnd;
                currentSum = arr[currentEnd];
            }

            if (currentSum > max) {
                max = currentSum;
                maxStart = currentStart;
                maxEnd = currentEnd;
            }
        }

        int[] location = Arrays.copyOfRange(arr, maxStart, maxEnd + 1);

        return Arrays.toString(location);
    }
}


