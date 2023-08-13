package Algorithms.Sorting._1_SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //
        int[] arr = selectionSort(new int[]{9, 3, 4, 10, 1});
        System.out.println(Arrays.toString(arr));
    }

    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int minId = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minId]) {
                    minId = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minId];
            arr[minId] = temp;

        }
        return arr;
    }
}
