package DataStructure.NonLinear.Tree.BinaryTree;

public interface PostOrderTraversal<E> {
    public default void postOrderTraverse(Node<E> node) {

        if (node == null) return;

        postOrderTraverse(node.leftNode);

        postOrderTraverse(node.rightNode);

        System.out.println(node.key);

    }


    default void postOrderTraversalIterative() {
        return;
    }
}
