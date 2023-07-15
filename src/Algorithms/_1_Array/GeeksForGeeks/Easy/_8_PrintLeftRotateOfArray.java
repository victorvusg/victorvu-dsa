package Algorithms._1_Array.GeeksForGeeks.Easy;

/**
 * Input :
 * arr[] = {1, 3, 5, 7, 9}
 * k1 = 1
 * k2 = 3
 * k3 = 4
 * k4 = 6
 *
 * Output :
 * 3 5 7 9 1
 * 7 9 1 3 5
 * 9 1 3 5 7
 * 3 5 7 9 1
 *
 * Input :
 * arr[] = {1, 3, 5, 7, 9}
 * k1 = 14
 * Output :
 * 9 1 3 5 7
 *
 * Time complexity required: O(n)
 * Space complexity required: O(1)
 */
public class _8_PrintLeftRotateOfArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //
        printLeftRotateArray(array, 190000);

        printLeftRotateArray(array, 4);

        printLeftRotateArray(array, 5);

    }

    public static void printLeftRotateArray(int[] array, int amount) {

        int rotateAmount = amount;
        while (rotateAmount >= array.length) {
            rotateAmount = rotateAmount % array.length;
        }

        if (rotateAmount == 0) rotateAmount = array.length + 1;

        for (int i = rotateAmount - 1; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < rotateAmount - 1; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\n");
    }

}
