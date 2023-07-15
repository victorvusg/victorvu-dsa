package DataStructure.NonLinear.Tree.BinaryTree;

public interface PreOrderTraversal<E> {
    public default void preOrderTraverseRecursion(Node<E> node) {

        if (node == null) return;

        // Print current node value
        System.out.println(node.key);

        // Left traversal
        preOrderTraverseRecursion(node.leftNode);

        // Right traversal
        preOrderTraverseRecursion(node.rightNode);

    }

    /**
     * Morris Traversal Pre Order
     * TODO:
     *
     */
    default void preOrderTraversalMorris() {}

    /**
     * Iterative Pre Order Traversal
     * TODO:
     */
    default void preOrderTraversalIteration() {}
}
