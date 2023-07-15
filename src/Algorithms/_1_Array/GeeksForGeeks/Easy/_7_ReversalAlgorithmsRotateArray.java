package Algorithms._1_Array.GeeksForGeeks.Easy;

import java.util.Arrays;

/**
 * Input:  arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
 * Output: 3, 4, 5, 6, 7, 1, 2
 * Explanation: If the array is rotated by 1 position to the left,
 * it becomes {2, 3, 4, 5, 6, 7, 1}.
 * When it is rotated further by 1 position,
 * it becomes: {3, 4, 5, 6, 7, 1, 2}
 *
 * Input: arr[] = {1, 6, 7, 8}, d = 3
 * Output: 8, 1, 6, 7
 */

public class _7_ReversalAlgorithmsRotateArray {

    public static void main(String[] args) throws Exception {

        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(rotateLeft(testArray, 1)));

    }

    public static int[] rotateLeft(int[] array, int number) throws Exception {

        if (number > array.length) throw new Exception("Invalid number");

        int[] rotateArray = Arrays.copyOfRange(array, 0, number);

        for (int i = 0; i < array.length; i++) {
            if (i < (array.length - number)) {
                array[i] = array[i + number];
            } else {
                array[i] = rotateArray[i - (array.length - number)];
            }
        }

        return array;
    }
}
