package Algorithms._1_Array.GeeksForGeeks.Easy;

import java.util.Arrays;

/**
 * Input  : arr[] = {1, 2, 3}
 * Output : arr[] = {3, 2, 1}
 *
 * Input :  arr[] = {4, 5, 1, 2}
 * Output : arr[] = {2, 1, 5, 4}
 */
public class _0_ReverseArray {
    public static void main(String[] args) {
        int[] testArr = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(reverseArrayRecursiveWay(testArr, 0, testArr.length - 1)));
    }

    /**
     * Reverse array recursive way int [ ].
     *
     * @param array the array
     * @param start the start
     * @param end   the end
     * @return the int [ ]
     */
    public static int[] reverseArrayRecursiveWay(int[] array, int start, int end) {

        if (start >= end) return array;

        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        start++;
        end--;

        return reverseArrayRecursiveWay(array, start, end);

    }


    /**
     * Reverse array iterative way int [ ].
     *
     * @param array the array
     * @return the int [ ]
     */
    public static int[] reverseArrayIterativeWay(int[] array) {
        int start = 0;
        int end = array.length - 1;
        int temp;


        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }

        return array;
    }
}
