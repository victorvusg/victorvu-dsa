package DataStructure.Linear.Static;

import java.util.ArrayList;

/**
 * The type Main.
 */
public class Main {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

//        ArrayClass arrayClass = new ArrayClass(3);
//        arrayClass.set(0, 100);
//        arrayClass.set(1, 10);
//        arrayClass.set(2, 20);

        // Push value
//        arrayClass.push(30);
//        for (int i = 0; i < arrayClass.length; i++) {
//            System.out.println(arrayClass.get(i).toString());
//        }

        // Pop value
//        arrayClass.pop();
//        for (int i = 0; i < arrayClass.length; i++) {
//            System.out.println(arrayClass.get(i).toString());
//        }

        // Merge value
//        ArrayClass arrayClass1 = new ArrayClass(1);
//        arrayClass.merge(arrayClass1);
//
//        for (int i = 0; i < arrayClass.length; i++) {
//            System.out.println(arrayClass.get(i).toString());
//        }

        ArrayList<Integer> array = new ArrayList<Integer>(1);
        array.add(0, 10);
        array.add(1, 11);
        array.add(0, 13);

        System.out.println(array.toString());


    }
}
