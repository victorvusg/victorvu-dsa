package Algorithms._7_Searching._2_BinarySearch;

public class Main {
    public static void main(String[] args) {
        //
        int index = binarySearch(new int[]{1, 2, 4, 5, 6, 8}, 1);
        System.out.println(index);
    }

    public static int binarySearch(int[] arr, int val) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] > val)  {
                end = mid - 1;
            } else if (arr[mid] < val) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
