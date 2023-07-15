package Algorithms._1_Array.GeeksForGeeks.Easy;

import java.util.Arrays;

/**
 * Input : [1, 2, 3]
 * Output : [1], [1, 2], [2], [1, 2, 3], [2, 3], [3]
 * Input : [1, 2]
 * Output : [1], [1, 2], [2]
 */
public class _0_GenerateSubArray {
    public static void main(String[] args) {
        //
        int[] initialArray = { 1, 2, 3 };
        generateAllSubArray(initialArray, 0);
    }

    public static void generateAllSubArray(int[] array, int lastIndex) {
        // Break condition
        if (lastIndex >= array.length) {
            return;
        }

        for (int i = 0; i <= lastIndex; i++) {
            int[] printArray = Arrays.copyOfRange(array, i, lastIndex + 1);
            System.out.println(Arrays.toString(printArray));
        }
        lastIndex++;
        generateAllSubArray(array, lastIndex);
        System.out.println("Hello");
    }
}
