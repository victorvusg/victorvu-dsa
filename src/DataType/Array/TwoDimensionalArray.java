package DataType.Array;

import Common.Constants;

public class TwoDimensionalArray {

    protected int[][] value;

    public static void main(String[] args) {
        System.out.println(Constants.mainFunctionLog);
    }

    public TwoDimensionalArray(int x, int y) {
        this.value = new int[x][y];
    }

    public int[][] getValues() {
        return value;
    }

    public int getValue(int x, int y) {
        return this.value[x][y];
    }

    public void setValue(int x, int y, int value) {
        this.value[x][y] = value;
    }

    public void setValues(int[][] value) {
        this.value = value;
    }
}
