package DataStructure.Linear.Dynamic.LinkedList.Doubly;

public class Main {

    public static void main(String[] args) {
        DoublyList<Integer> doublyList = new DoublyList<Integer>(10);

        doublyList.push(20);
        doublyList.push(30);
        doublyList.push(40);


        System.out.println(doublyList.getNodeByIndex(3).value);
    }

}
