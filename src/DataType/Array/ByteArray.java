package DataType.Array;

public class ByteArray {

    protected byte[] value;

    public int length;

    public static void main(String[] args) {
        System.out.println("This is Byte Array");
    }

    public ByteArray(byte[] value) {
        this.value = value;
        this.length = value.length;
    }

    public ByteArray push(byte value) {
        byte[] newArray;
        newArray = this.value;
        newArray[this.length] = value;
        return this;
    }

}
