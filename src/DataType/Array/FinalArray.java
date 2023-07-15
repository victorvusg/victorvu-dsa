package DataType.Array;

import Common.Constants;

import java.util.Arrays;

public class FinalArray {

    public static void main(String[] args) {
        System.out.println(Constants.mainFunctionLog);

        final int[] finalArray = {1, 2, 3, 4};

        finalArray[1] = 6;

        System.out.println(Arrays.toString(finalArray));

    }
}
