package DataType.Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is main function");

        // ByteArray Application
//        byte[] bytes = {0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09};
//        ByteArray byteArray = new ByteArray( bytes );
//        byte newByte = 0x01;
//        byteArray.push(newByte);


        // IntegerArray Application
        IntegerArray integerArray = new IntegerArray(new int[]{1, 2, 3});
        integerArray.push(4);
//        for (int i = 0; i < integerArray.length; i++) {
//            System.out.println(integerArray.value[i]);
//        }

        // CharArray application
        CharArray charArray = new CharArray(new char[]{'a', 'b'});
        charArray.push('c');
//        System.out.println(charArray);

        // Two Dimension Array
        TwoDimensionalArray intJaggedArray = new TwoDimensionalArray(2, 3);
        intJaggedArray.setValue(1,1,5);
//        System.out.println(Arrays.deepToString(intJaggedArray.getValues()));
    }
}
