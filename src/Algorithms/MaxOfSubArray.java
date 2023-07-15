package Algorithms;

import java.util.Arrays;

/**
 * Input:
 *         N = 9, K = 3
 *         arr[] = 1 2 3 1 4 5 2 3 6
 *         Output:
 *         3 3 4 5 5 5 6
 *         Explanation:
 *         1st contiguous subarray = {1 2 3} Max = 3
 *         2nd contiguous subarray = {2 3 1} Max = 3
 *         3rd contiguous subarray = {3 1 4} Max = 4
 *         4th contiguous subarray = {1 4 5} Max = 5
 *         5th contiguous subarray = {4 5 2} Max = 5
 *         6th contiguous subarray = {5 2 3} Max = 5
 *         7th contiguous subarray = {2 3 6} Max = 6
 */

public class MaxOfSubArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxOfSubArray(new int[]{1, 2, 3, 1, 4, 5, 2, 3, 6,}, 3)));
    }

    public static int[] maxOfSubArray(int[] inputArray, int subArrayLength) {
        int[] maxValueArray = new int[inputArray.length - subArrayLength + 1];
        for (int i = 0; i < maxValueArray.length; i++) {
            maxValueArray[i] = maxOfArray(new int[]{inputArray[i], inputArray[i + 1], inputArray[i + 2]});
        }
        return maxValueArray;
    }

    public static int maxOfArray(int[] array) {
        int max = array[0];
        for (int j : array) {
            if (j > max) max = j;
        }
        return max;
    }

}
