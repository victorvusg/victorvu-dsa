package Algorithms;

/**
 * The type Mathematics.
 */
public class Mathematics  {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }


    /**
     * Factorial int.
     *
     * @param n the n
     * @return the int
     */
    public static int factorial(int n) {

        int result = n;

        if (n == 1) return result;

        result = result * factorial(n - 1);

        return result;

    }
}
