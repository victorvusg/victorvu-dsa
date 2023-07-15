package DataStructure.Linear.Dynamic.LinkedList.Doubly;

public class DoublyList<E> {

    DoublyNode<E> firstNode;

    DoublyNode<E> lastNode;

    int length;

    public DoublyList (E value) {
        DoublyNode<E> newNode = new DoublyNode<E>(value);
        firstNode = lastNode = newNode;
        length = 1;
    }

    public void push (E value) {
        DoublyNode<E> newNode = new DoublyNode<E>(value);
        newNode.setPrevNode(lastNode);

        lastNode.setNextNode(newNode);
        lastNode = newNode;
        length++;
    }

    public void pop() {
        lastNode = (DoublyNode<E>) lastNode.prevNode;
        lastNode.setNextNode(null);
    }

    public DoublyNode<E> getNodeByIndex (int index) {
        DoublyNode<E> pointer = firstNode;

        for (int i = 0; i < index; i++) {
            pointer = (DoublyNode<E>) pointer.nextNode;
        }

        return pointer;
    }

}
