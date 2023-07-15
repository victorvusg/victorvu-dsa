package Algorithms._2_String.GeeksForGeeks.Easy;

import java.util.Stack;

public class _1_ReverseString {

    public static void main(String[] args) {
        //
        String testString = "This is Vietnam";
        System.out.println(reverseStringByStack(testString.toCharArray()));

    }

    public static char[] reverseStringByStack(char[] str) {

        Stack<Character> tempStack = new Stack<Character>();

        for (char c : str) {
            tempStack.push(c);
        }

        for (int i = 0; i < str.length; i++) {
            str[i] = tempStack.pop();
        }

        return str;

    }

}
