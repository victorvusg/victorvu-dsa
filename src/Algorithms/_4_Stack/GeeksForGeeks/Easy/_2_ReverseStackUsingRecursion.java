package Algorithms._4_Stack.GeeksForGeeks.Easy;

import java.util.Arrays;
import java.util.Stack;

public class _2_ReverseStackUsingRecursion {

    public static void main(String[] args) {
        //
        Stack<Integer> testStack = new Stack<Integer>();
        testStack.push(1);
        testStack.push(2);
        testStack.push(3);
        testStack.push(4);

        System.out.println(Arrays.toString(testStack.toArray()));
    }

    public static Stack<Integer> reverse (Stack<Integer> stack) {
        return stack;
    }
}
