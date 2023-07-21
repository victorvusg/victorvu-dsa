package DataStructure.NonLinear.Set.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        //
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(1111);

        Iterator<Integer> iterator = linkedHashSet.iterator();
        System.out.println(iterator.next());

    }

}
