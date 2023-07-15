package DataStructure.Linear.Dynamic.LinkedList.Doubly;

import DataStructure.Linear.Dynamic.LinkedList.BaseNode;

public class DoublyNode<E> extends BaseNode<E> implements DoublyNodeInterface<E> {

    public BaseNode<E> prevNode;

    public DoublyNode (E value) {
        this.setValue(value);
        this.setNextNode(null);
        this.setPrevNode(null);
    }

    @Override
    public void setValue(E value) {
        this.value = value;
    }

    @Override
    public void setNextNode(DoublyNode<E> node) {
        this.nextNode = node;
    }

    @Override
    public void setPrevNode(DoublyNode<E> node) {
        this.prevNode = node;
    }
}
