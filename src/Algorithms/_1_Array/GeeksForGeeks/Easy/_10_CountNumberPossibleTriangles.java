package Algorithms._1_Array.GeeksForGeeks.Easy;

/**
 * Input: arr= {4, 6, 3, 7}
 * Output: 3
 * Explanation: There are three triangles
 * possible {3, 4, 6}, {4, 6, 7} and {3, 6, 7}.
 * Note that {3, 4, 7} is not a possible triangle.
 *
 * Input: arr= {10, 21, 22, 100, 101, 200, 300}.
 * Output: 6
 * Explanation: There can be 6 possible triangles:
 * {10, 21, 22}, {21, 100, 101}, {22, 100, 101},
 * {10, 100, 101}, {100, 101, 200} and {101, 200, 300}
 *
 * Time Complexity: O(N3) where N is the size of the input array
 * Auxiliary Space: O(1)
 *
 * Time complexity: O(N2). As two nested loops are used, overall iterations in comparison to the above method reduces greatly.
 * Auxiliary Space: O(1). As no extra space is required, Auxiliary Space is constant
 */
public class _10_CountNumberPossibleTriangles {

    public static void main(String[] args) {
        int[] array = {10, 21, 22, 100, 101, 200, 300};
        System.out.println(countNumberPossibleTriangles(array));
    }

    public static int countNumberPossibleTriangles (int[] array) {

        //TODO: To be implemented
        for (int i = 0; i < array.length - 2; i++) {
            for (int j = 1; j < array.length - 1; j++) {

            }
        }

        return 1;
    }

}
