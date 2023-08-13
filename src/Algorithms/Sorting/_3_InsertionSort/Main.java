package Algorithms.Sorting._3_InsertionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //
        System.out.println(Arrays.toString(insertionSort(new int[]{1, 2, 5, -1})));
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int current = i - 1;

            while (current >= 0 && temp < arr[current]) {
                arr[current + 1] = arr[current];
                current--;
            }
            arr[current + 1] = temp;
        }
        return arr;
    }
}
