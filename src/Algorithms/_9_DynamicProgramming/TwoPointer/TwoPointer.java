package Algorithms._9_DynamicProgramming.TwoPointer;

import java.util.Arrays;

public class TwoPointer {
    public static void main(String[] args) throws Exception {
        //
        int[] array = new int[]{0, 1, 4, 6, 7, 11, 11, 34, 100};

        System.out.println(Arrays.toString(twoPointer(array, 10111)));
    }

    public static int[] twoPointer(int[] arr, int sum) throws Exception {
        int firstPointer = 0;
        int secondPointer = arr.length - 1;
        while (firstPointer <= secondPointer) {
            if (arr[firstPointer] + arr[secondPointer] < sum) {
                firstPointer++;
            } else if (arr[firstPointer] + arr[secondPointer] > sum) {
                secondPointer--;
            } else {
                return new int[] {firstPointer, secondPointer};
            }
        }

        throw new Exception("Could not found");
    }
}
