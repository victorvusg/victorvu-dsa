package DataType;

public class JarArray {

    public static void main(String[] args) {

        // Byte DataType.Array Example
        JarArray.ByteArray();


        // Char DataType.Array = String
        char[] thisString = new char[100];
        thisString[0] = 'T';
        thisString[1] = 'h';

        System.out.println(thisString);

    }

    public static void ByteArray() {
        // Byte DataType.Array
        byte[] byteArray = new byte[1];
        byteArray[0] = 3;
        System.out.println(byteArray[0]);
    }

    public static void CharacterArray() {
        // Character DataType.Array
        char[] charArray = new char[100];
        charArray[0] = 'T';
        charArray[1] = 'h';

        System.out.println(charArray);
    }
}
