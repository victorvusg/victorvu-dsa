package Algorithms._4_Stack.GeeksForGeeks.Easy;

import java.util.Arrays;
import java.util.Stack;

/**
 * Input: exp = “[()]{}{[()()]()}”
 * Output: Balanced
 * Explanation: all the brackets are well-formed
 *
 * Input: exp = “[(])”
 * Output: Not Balanced
 * Explanation: 1 and 4 brackets are not balanced because
 * there is a closing ‘]’ before the closing ‘(‘
 */
public class _1_CheckBalancedBrackets {
    public static void main(String[] args) {
        //
        System.out.println(isBalancedBrackets("[()]{(}){[()]()}"));
    }

    public static boolean isBalancedBrackets(String pattern) {
        Stack<Character> stackExp = new Stack<Character>();
        for (int i = 0; i < pattern.length(); i ++) {
            stackExp.push(pattern.charAt(i));
            if (stackExp.size() > 1 &&
                    ((stackExp.lastElement() == '}' && stackExp.get(stackExp.size() - 2) == '{') ||
                    (stackExp.lastElement() == ')' && stackExp.get(stackExp.size() - 2) == '(') ||
                    (stackExp.lastElement() == ']' && stackExp.get(stackExp.size() - 2) == '['))
            ) {
                stackExp.pop();
                stackExp.pop();
            }
        }

        System.out.println(Arrays.toString(stackExp.toArray()));

        return stackExp.isEmpty();
    }

}
