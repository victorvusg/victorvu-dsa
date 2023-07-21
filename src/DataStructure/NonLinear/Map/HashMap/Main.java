package DataStructure.NonLinear.Map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //
        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Peter");
        hashMap.put(4, "James");
        hashMap.put(5, "James");

        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
    }
}
