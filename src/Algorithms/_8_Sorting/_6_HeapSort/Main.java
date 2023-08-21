package Algorithms._8_Sorting._6_HeapSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {500, 6, 7, -3, 10, -1};

        System.out.println(Arrays.toString(heapSort(arr)));
    }

    public static int[] heapSort(int[] arr) {
        int[] array = arr;
        for (int i = 0; i < arr.length; i++) {
            array = heapifyUpward(arr, i);
        }

        return array;
    }

    public static int[] heapifyUpward(int[] arr, int index) {
        int parentIndex = (index + 1) / 2 - 1;
        if (parentIndex < 0) return arr;

        if (arr[parentIndex] > arr[index]) {
            int temp = arr[parentIndex];
            arr[parentIndex] = arr[index];
            arr[index] = temp;
        }

        return heapifyUpward(arr, parentIndex);

    }
}
