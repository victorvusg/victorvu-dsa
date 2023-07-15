package DataType.Array;

import Common.Constants;

public class CharArray {

    protected char[] value;

    public int length;

    public static void main(String[] args) {
        System.out.println(Constants.mainFunctionLog);
    }

    public CharArray(char[] value) {
        this.value = value;
        this.length = value.length;
    }

    public CharArray push(char value) {
        char[] newCharArray = new char[this.length + 1];
        if (this.length >= 0) System.arraycopy(this.value, 0, newCharArray, 0, this.length);

        newCharArray[this.length] = value;

        this.length++;
        this.value = newCharArray;

        return this;
    }
}
