package Algorithms._1_Array.GeeksForGeeks.Easy;

import java.util.Arrays;

public class _3_MoveAllZeroToTheEndOfArray {

    public static void main(String[] args) {
        // TODO:
        System.out.println(
                Arrays.toString(moveAllZeroToTheEndOfArray(new int[]{0, 0, 1, 99, -1, 4, 0, 6, -1, 0, 3, 0}))
        );
    }

    /**
     * Move all zero to the end of array int [ ].
     * Complexity O(n)
     * @param arr the arr
     * @return the int [ ]
     */
    public static int[] moveAllZeroToTheEndOfArray(int[] arr) {

        int zeroValueCount = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                int temp = arr[arr.length - 1 - zeroValueCount];
                arr[arr.length - 1 - zeroValueCount] = 0;
                arr[i] = temp;
                zeroValueCount++;
            }
        }

        return arr;
    }
}
