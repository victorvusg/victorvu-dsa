package DataStructure.NonLinear.Tree.BinarySearchTree;

public class Node<E> {

    public E val;

    public Node<E> left = null;

    public Node<E> right = null;

    public Node(E value) {
        this.val = value;
    }
}
