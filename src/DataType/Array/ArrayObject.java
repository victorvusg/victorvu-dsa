
package DataType.Array;

import Common.Constants;

import java.util.Arrays;

public class ArrayObject {

    public static void main(String[] args) {
        System.out.println(Constants.mainFunctionLog);

        IntegerArray integerArray = new IntegerArray(new int[]{1, 2, 3, 4, 5});

        int intResult = Arrays.binarySearch(integerArray.value, 1);

        System.out.println(Constants.ANSI_WHITE + intResult + Constants.ANSI_WHITE);

    }
}
