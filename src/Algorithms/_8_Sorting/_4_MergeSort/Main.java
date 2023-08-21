package Algorithms._8_Sorting._4_MergeSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Merge sort

        int[] array = new int[]{-10, -1, 6, 3, -0, 10, 0, 11};

//        int[] f2 = new int[]{1, 3, 5, 7};
//        int[] f1 = new int[]{2, 4, 6, 8};
//
//        System.out.println(Arrays.toString(merge(f1, f2)));


        System.out.println(Arrays.toString(mergeSort(array)));
    }

    public static int[] mergeSort(int[] arr) {

        if (arr.length < 2) return arr;

        else if (arr.length == 2) {
            if (arr[0] > arr[1]) {
                int temp = arr[0];
                arr[0] = arr[1];
                arr[1] = temp;
                return arr;
            }
        } else {
            int middle = (arr.length - 1) / 2;
            int[] first = Arrays.copyOfRange(arr, 0, middle);
            int[] second = Arrays.copyOfRange(arr, middle, arr.length);
            first = mergeSort(first);
            second = mergeSort(second);
            return merge(first, second);
        }
        return arr;
    }

    public static int[] merge(int[] firstArray, int[] secondArray) {
        int first = 0;
        int second = 0;
        int merge = 0;

        int[] mergedArray = new int[firstArray.length + secondArray.length];

        while (merge < mergedArray.length) {
            if (first == firstArray.length) {
                mergedArray[merge] = secondArray[second];
                second++;
            } else if (second == secondArray.length) {
                mergedArray[merge] = firstArray[first];
                first++;
            } else {
                if (firstArray[first] > secondArray[second]) {
                    mergedArray[merge] = secondArray[second];
                    second++;
                } else {
                    mergedArray[merge] = firstArray[first];
                    first++;
                }
            }
            merge++;
        }

        return mergedArray;
    }
}
