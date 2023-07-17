package DataStructure.NonLinear.Tree.BinaryTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Stack;

public interface LevelOrderTraverse<E> {

    /**
     * Level Order Traversal by Recursion
     */
    default void levelOrderTraverseRecursion(ArrayList<Node<E>> nodes) {
        //
        if (nodes.size() == 0) return;

        ArrayList<Node<E>> childNodes = new ArrayList<Node<E>>();
        for (Node<E> currentNode : nodes) {
            System.out.println(currentNode.key);
            if (currentNode.leftNode != null) childNodes.add(currentNode.leftNode);
            if (currentNode.rightNode != null) childNodes.add(currentNode.rightNode);
        }

        levelOrderTraverseRecursion(childNodes);
    }

    /**
     * Level Order Traversal Spiral Form with recursion
     */
    default void levelOrderTraverseSpiralForm(Deque<Node<E>> childNodes, int height) {
        if (childNodes.size() == 0) return;

        int childNodeCount = childNodes.size();

        while (childNodeCount > 0) {
            if (height % 2 == 0) {
                Node<E> tempNode = childNodes.getLast();
                System.out.println(tempNode.key);

                if (tempNode.rightNode != null) childNodes.addFirst(tempNode.rightNode);
                if (tempNode.leftNode != null) childNodes.addFirst(tempNode.leftNode);
                childNodes.removeLast();
            } else {
                Node<E> tempNode = childNodes.getFirst();
                System.out.println(tempNode.key);

                if(tempNode.leftNode != null) childNodes.addLast(tempNode.leftNode);
                if(tempNode.rightNode != null) childNodes.addLast(tempNode.rightNode);
                childNodes.removeFirst();
            }
            childNodeCount--;
        }

        levelOrderTraverseSpiralForm(childNodes, height + 1);

    }

    /**
     * Traverse from bottom to top, from left to right
     * With Recursion
     */
    public default Stack<Node<E>> reverseLevelOrderTraversal (Stack<Node<E>> node, ArrayDeque<Node<E>> childNode) {
        if (childNode.size() < 1) return node;

        int childNodeSize = childNode.size();

        while (childNodeSize > 0) {
            Node<E> temp = childNode.getLast();
            if (temp.rightNode != null) childNode.addFirst(temp.rightNode);
            if (temp.leftNode != null) childNode.addFirst(temp.leftNode);

            node.push(new Node<E>(temp.key));
            childNode.removeLast();

            childNodeSize--;
        }

        return reverseLevelOrderTraversal(node, childNode);
    }

    /**
     * Reverse Level Order Traversal
     * With Recursion
     */
    public default void reverseLevelOrderTraversal (Node<E> rootNode) {
        Stack<Node<E>> stack = new Stack<>();
        ArrayDeque<Node<E>> childNodes = new ArrayDeque<>();

        if (rootNode != null) stack.push(rootNode);
        else return;


        if (rootNode.rightNode != null) childNodes.addFirst(rootNode.rightNode);
        if (rootNode != null) childNodes.addFirst(rootNode.leftNode);

        this.reverseLevelOrderTraversal(stack, childNodes);
    }

    /**
     * Level order traversal without recursion
     */

    public default void levelOrderTraversalWithoutRecursion (Node<E> rootNode) {
        if (rootNode == null) return;
        ArrayDeque<Node<E>> callStack = new ArrayDeque<Node<E>>();
        callStack.addLast(rootNode);
        int size = callStack.size();

        while (size > 0) {
            Node<E> tempNode = callStack.removeFirst();
            size--;

            System.out.println(tempNode.key);

            if (tempNode.leftNode != null) {
                callStack.addLast(tempNode.leftNode);
                size++;
            }
            if (tempNode.rightNode != null) {
                callStack.addLast(tempNode.rightNode);
                size++;
            }


        }
    }
}
