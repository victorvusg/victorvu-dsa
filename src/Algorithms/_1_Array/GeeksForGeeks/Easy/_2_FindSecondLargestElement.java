package Algorithms._1_Array.GeeksForGeeks.Easy;

import java.util.Arrays;

/**
 * Input: arr[] = {12, 35, 1, 10, 34, 1}
 * Output: The Second largest element is 34.
 * Explanation: The largest element of the
 * array is 35 and the second
 * largest element is 34
 */
public class _2_FindSecondLargestElement {

    public static String NOT_FOUND = "There is no second largest value";

    public static void main(String[] args) {
        try {
            findSecondLargestElement(new int[]{4, 6, 3, 0, 10, 11, 0});
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int findSecondLargestElement(int[] arr) throws Exception {
        // TODO: To be implemented
        Arrays.sort(arr);

        if (arr.length < 2) throw new Exception(NOT_FOUND);



        return 1;
    }
}
