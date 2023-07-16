package DataStructure.NonLinear.Tree.BinarySearchTree;

public interface BasicOperator {

    void insert(int value);

    default void insert(int value, Node<Integer> root) {
        if (root == null) return;
        Node<Integer> current = root;

        while (current != null) {
            if (value < current.val) {
                if (current.left != null) {
                    current = current.left;
                } else {
                    current.left = new Node<>(value);
                    current = null;
                }
            } else {
                if (current.right != null) {
                    current = current.right;
                } else {
                    current.right = new Node<>(value);
                    current = null;
                }
            }
        }
    }

    void inOrderTraverse();

    default void inOrderTraverse(Node<Integer> root) {

    }
}
