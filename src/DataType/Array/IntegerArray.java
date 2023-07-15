package DataType.Array;

public class IntegerArray {

    protected int[] value;

    protected int length;

    public static void main(String[] args) {

    }

    public IntegerArray(int[] value) {
        this.value = value;
        this.length = value.length;
    }

    public IntegerArray push(int value) {
        int[] newArray = new int[this.length + 1];
        if (this.length >= 0) System.arraycopy(this.value, 0, newArray, 0, this.length);
        newArray[length] = value;
        this.value = newArray;
        length++;

        return this;
    }

}
