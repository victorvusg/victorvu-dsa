package DataStructure.NonLinear.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //

        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(10);
        hashSet.add(11);
        hashSet.add(12);

        System.out.println(hashSet.hashCode() + ": Hash Code");

        Iterator<Integer> iterator = hashSet.iterator();

        System.out.println(iterator.next());
        System.out.println(iterator.hashCode());

        System.out.println(iterator.next());
        System.out.println(iterator.hashCode());

    }


}
