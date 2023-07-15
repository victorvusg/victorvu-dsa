package DataStructure.Linear.Dynamic.LinkedList.Doubly;

public interface DoublyNodeInterface<E> {

    public void setValue(E value);

    public void setNextNode(DoublyNode<E> node);

    public void setPrevNode(DoublyNode<E> node);

}
