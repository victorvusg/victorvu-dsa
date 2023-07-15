package DataStructure.Linear.Dynamic.LinkedList.Singly;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        SinglyList<Integer> testSingleList = new SinglyList<Integer>(1);
//        testSingleList.push(2);
//        testSingleList.push(3);
//        testSingleList.push(5);

//        try {
//            System.out.println(testSingleList.getNodeByIndex(3).value);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

//        testSingleList.pop();
//
//        try {
//            System.out.println(testSingleList.getNodeByIndex(2).value);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

//        try {
//            testSingleList.insert(20, 0);
//            System.out.println(testSingleList.getNodeByIndex(5).value);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

//        System.out.println(testSingleList.contains(145));

        implementReverseTraverse();
    }


    public static void implementReverseTraverse() {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);


        traverse(list, 0);
    }

    public static void traverse(LinkedList<Integer> list, int index) {
        if (index > list.size() - 1) return;

        traverse(list, index + 1);
        System.out.println(list.get(index));
    }
}
