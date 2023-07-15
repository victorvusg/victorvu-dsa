package Algorithms._1_Array.GeeksForGeeks.Easy;

import java.util.Arrays;

/**
 * Input: arr[] = {10, 4, 3, 50, 23, 90}
 * Output: 90, 50, 23
 */
public class _1_FindThreeBiggestDistinctElement {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        double[] testArray = new double[]{1, 2, 3, 4, 5, 10, 4, 5, 6, 99 ,3};

        System.out.println(Arrays.toString(findBiggestDistinctElement(testArray)));

    }

    /**
     * Quick sort
     * Complexity: O(nlog(n))
     * TODO: To be implemented later on
     */
    public static double[] findBiggestDistinctQuickSort(double[] array) {
        //TODO: To be implemented
        return new double[1];
    }

    /**
     * Find biggest distinct element double [ ].
     * Complexity: O(n)
     * @param array the array
     * @return the double [ ]
     */
    public static double[] findBiggestDistinctElement(double[] array) {
        if (array.length < 3) return array;

        double[] biggestArray = new double[] { Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY };

        for (double v : array) {
            if (v > biggestArray[0]) {
                biggestArray[2] = biggestArray[1];
                biggestArray[1] = biggestArray[0];
                biggestArray[0] = v;
            } else if (v > biggestArray[1]) {
                biggestArray[2] = biggestArray[1];
                biggestArray[1] = v;
            } else if (v > biggestArray[2]) {
                biggestArray[2] = v;
            }
        }

        return biggestArray;
    }
}
