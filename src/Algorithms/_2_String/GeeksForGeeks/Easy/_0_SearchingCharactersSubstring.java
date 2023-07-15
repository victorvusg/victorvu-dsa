package Algorithms._2_String.GeeksForGeeks.Easy;

public class _0_SearchingCharactersSubstring {
    public static void main(String[] args) {
        //
        String currentString = "Hello, this is IntelliJ IDEA";
        System.out.println(indexOfSubString(currentString, "this"));
        System.out.println(currentString.charAt(indexOfSubString(currentString, "this")));
    }

    public static int indexOf(String str, char c) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) return i;
        }
        return 0;
    }

    public static int lastIndexOf(String str, char c) {
        return 0;
    }

    public static int indexOfSubString(String str, String subStr) {

        int subStrLength = subStr.length();

        int similarCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == subStr.charAt(similarCount)) {
                similarCount++;
                if (similarCount == subStrLength) {
                    return i - similarCount + 1;
                }
            } else {
                similarCount = 0;
            }
        }

        return -1;
    }

}
