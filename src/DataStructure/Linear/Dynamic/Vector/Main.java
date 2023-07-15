package DataStructure.Linear.Dynamic.Vector;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        //

        Vector<Vector<Integer>> vector = new Vector<>();

        vector.add(new Vector<>());

        vector.get(0).add(1);
        vector.get(0).add(2);

        vector.add(new Vector<>(new Vector<>()));

        vector.get(1).addAll(vector.get(0));

        System.out.println(vector.toString());


    }
}
