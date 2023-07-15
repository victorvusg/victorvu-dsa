package DataStructure.Linear.Dynamic.LinkedList.Singly;

import java.rmi.StubNotFoundException;

public class SinglyList<E> {

    public SinglyNode<E> firstNode;

    public SinglyNode<E> lastNode;

    public int length = 0;

    public SinglyList(E value) {
        this.firstNode = new SinglyNode<E>(value);
        this.lastNode = firstNode;
        this.length = 1;
    }

    public void push(E value) {
        SinglyNode<E> newNode = new SinglyNode<E>(value);

        this.lastNode.setNextNode(newNode);
        this.lastNode = newNode;

        this.length++;
    }

    public void pop() {
        try {
            this.lastNode = this.getNodeByIndex(this.length - 2);
            this.lastNode.nextNode = null;
            this.length--;
        } catch (Exception ignored) {}
    }

    public void insert(E value, int index) throws StubNotFoundException {
        try {
            SinglyNode<E> targetNode = this.getNodeByIndex(index);
            SinglyNode<E> newNode = new SinglyNode<E>(value);

            newNode.setNextNode((SinglyNode<E>) targetNode.nextNode);
            targetNode.setNextNode(newNode);
            this.length++;
        } catch (StubNotFoundException e) {
            throw new StubNotFoundException(e.getMessage());
        }
    }

    public SinglyNode<E> getNodeByIndex(int id) throws StubNotFoundException {
        if (id > length) throw new StubNotFoundException("Invalid index");

        SinglyNode<E> node = this.firstNode;
        for (int i = 0; i < id; i++) {
            node = (SinglyNode<E>) node.nextNode;
        }
        return node;
    }

    public boolean contains (E value) {
        SinglyNode<E> node = this.firstNode;
        for (int i = 0; i < length; i++) {
            if (node.value == value) return true;
            node = (SinglyNode<E>) node.nextNode;
        }
        return false;
    }
}
