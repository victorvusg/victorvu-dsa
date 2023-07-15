package DataType;

import java.util.StringJoiner;
import java.util.StringTokenizer;

/**
 * The type Jar string.
 */
public class JarString {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main (String[] args) {
        // Create StringBuffer
        StringBuffer stringBuffer = new StringBuffer("This is Ho Chi Minh City");
        stringBuffer.append("buff");

        // Create StringTokenizer
        StringTokenizer stringTokenizer = new StringTokenizer("This is my phone");
        System.out.println(stringTokenizer.nextToken().toString());

        // String cannot be immutable
        String immutableString = "Immm";
        immutableString = "this is";
        System.out.println(immutableString);

        // Create StringJoiner
        StringJoiner stringJoiner = new StringJoiner(" ");
        stringJoiner.add("Hello");
        stringJoiner.add("World");

        System.out.println(stringJoiner.toString());
    }

    /**
     * Create string buffer
     *
     * @return StringBuffer
     */
    public static StringBuffer createStringBuffer() {
        return new StringBuffer();
    }

    /**
     * Create string builder
     *
     * @return the string builder
     */
    public static StringBuilder createStringBuilder() {
        return new StringBuilder();
    }


}
