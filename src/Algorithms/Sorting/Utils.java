package Algorithms.Sorting;

public class Utils {
    public static void main(String[] args) {
        //
        swap(1, 2);
    }

    public static void swap(int first, int second) {
        first = first + second; // sum
        second = first - second; // first
        first = first - second;

        System.out.println(first);
        System.out.println(second);
    }
}
