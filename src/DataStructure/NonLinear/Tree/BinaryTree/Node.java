package DataStructure.NonLinear.Tree.BinaryTree;

public class Node<E> {

    public E key;

    public Node<E> leftNode;

    public Node<E> rightNode;

    public Node(E key) {
        this.key = key;
        this.leftNode = this.rightNode = null;
    }

}
