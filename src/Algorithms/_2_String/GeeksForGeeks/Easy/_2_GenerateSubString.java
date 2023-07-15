package Algorithms._2_String.GeeksForGeeks.Easy;

import java.util.ArrayList;

public class _2_GenerateSubString {

    public static void main(String[] args) {
        //
        char[] str = "ABCD".toCharArray();
        printOutAllSubString(str);
    }

    public static void printOutAllSubString(char[] str) {
        //
        for (int i = 0; i < str.length; i++) {
            ArrayList<Character> tempStr = new ArrayList<Character>();

            for (int j = i; j < str.length; j++) {
                tempStr.add(str[j]);
                System.out.println(tempStr);
            }
        }
    }

}
