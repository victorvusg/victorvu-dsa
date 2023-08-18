package Algorithms.Sorting._5_QuickSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //

        System.out.println(Arrays.toString(quickSort(new int[]{0, 1, 10, 2, -9, 0, 2}, 0, 6)));
    }

    public static int[] quickSort(int[] arr, int front, int rear) {
        if (rear == front) return arr;
        if (rear - front == 1) {
           if (arr[front] > arr[rear]) {
               int temp = arr[front];
               arr[front] = arr[rear];
               arr[rear] = temp;
           }
           return arr;
        }

        // Pivot value to compare
        int pivot = arr[rear];

        // Index of last smaller element
        int last = -1;

        for (int i = front; i <= rear; i ++) {
            if (arr[i] <= pivot) {
                int temp = arr[last+1];
                arr[last+1] = arr[i];
                arr[i] = temp;
                last++;
            }
        }

        quickSort(arr, front, last - 1);
        quickSort(arr, last + 1, rear);

        return arr;
    }
}
