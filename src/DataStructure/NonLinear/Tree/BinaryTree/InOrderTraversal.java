package DataStructure.NonLinear.Tree.BinaryTree;

import java.util.Stack;

public interface InOrderTraversal<E> {

    /**
     * Traditional In Order Traversal
     *
     * Recursion traverse to left side
     * Recursion traverse to right side
     *
     */
    default void inOrderTraverseWithRecursion(Node<E> node) {

        if (node == null) return;

        // Traverse to last left node
        inOrderTraverseWithRecursion(node.leftNode);

        // Print current node value
        System.out.println(node.key);

        // Traverse in the right subtree
        inOrderTraverseWithRecursion(node.rightNode);

    }

    /**
     * Inorder traversal without recursion using stack
     * -
     * Step 0: Create stack
     *         current_node = root
     *
     * Step 1: Traverse to the most left
     *         Push left side node to stack
     *
     * Step 2: Pop node from stack
     *         Set current_node = Pop Node's right child
     *         GOTO Step1
     *
     * Time Complexity: O(N) where N is the number of nodes in the tree
     * Auxiliary Space: O(N)
     */
    default void inOrderTraversalWithoutRecursionUsingStack(Node<E> rootNode) {
        if (rootNode == null) return;

        Stack<Node<E>> stack = new Stack<>();

        Node<E> current = rootNode;

        while (stack.size() > 0 || current != null) {

            while (current != null) {
                stack.push(current);
                current = current.leftNode;
            }

            current = stack.pop();

            System.out.print(current.key + " ");

            current = current.rightNode;
        }
    }

    /**
     * Inorder traversal using Morris Traversal
     * TODO: To be implemented
     *
     * Time Complexity: O(N) where N is the number of nodes in the tree
     * Auxiliary Space: O(1)
     *
     */
    default void inOrderTraversalUsingMorrisTraversal(Node<E> rootNode) {
        return;
    }
}
