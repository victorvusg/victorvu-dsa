package DataStructure.NonLinear.Tree.BinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public interface BasicOperator<E> {

    public default int traverseHeight(Node<E> node, int height) {

        if (node == null) return height;

        int leftNodeHeight = traverseHeight(node.leftNode, height + 1);
        int rightNodeHeight = traverseHeight(node.rightNode, height + 1);

        return Math.max(leftNodeHeight, rightNodeHeight);
    }

    public default Node<E> traverseToLastLeftNode(Node<E> node) {
        if (node.leftNode == null) return node;
        Node<E> leftNode = node.leftNode;
        return traverseToLastLeftNode(leftNode);
    }

    public default int getHeight(Node<E> root) {
        return this.traverseHeight(root, 0);
    }

    public default void deleteNode(Node<E> node, E key) {
        if (node == null) return;

        Queue<Node<E>> queue = new LinkedList<Node<E>>();

        queue.add(node);

        while (queue.size() > 0) {
            Node<E> temp = queue.peek();
            if (temp.key == key) {
                if (temp.rightNode != null) {
                    temp.key = temp.rightNode.key;
                    temp.rightNode = null;
                    if (temp.leftNode != null) queue.add(temp.leftNode);
                } else if (temp.leftNode != null) {
                    temp.key = temp.leftNode.key;
                    temp.leftNode = null;
                } else {
                    temp = null;
                }
            }

            if (temp.rightNode != null) queue.add(temp.rightNode);
            if (temp.leftNode != null) queue.add(temp.leftNode);

            queue.poll();
        }

    }

    public default void insertLevelOrder(E key, Node<E> rootNode) {
        if (rootNode == null) {rootNode = new Node<E>(key); return;}

        while (rootNode.leftNode != null && rootNode.rightNode != null) {
            if (rootNode.leftNode.leftNode == null || rootNode.leftNode.rightNode == null) rootNode = rootNode.leftNode;
            else if (rootNode.rightNode.leftNode == null || rootNode.rightNode.rightNode == null) rootNode = rootNode.rightNode;
            else rootNode = rootNode.leftNode;
        }

        // Assign
        if (rootNode.leftNode == null) {
            rootNode.leftNode = new Node<E>(key);
        } else {
            rootNode.rightNode = new Node<E>(key);
        }
    }

    public default void insertLevelOrder_1 (E key, Node<E> rootNode) {
        if (rootNode == null) {
            rootNode = new Node<E>(key);
            return;
        }

        Queue<Node<E>> nodeQueue = new LinkedList<Node<E>>(List.of(rootNode));

        while (nodeQueue.size() > 0) {
            Node<E> tempNode = nodeQueue.peek();

            if (tempNode.leftNode == null) {
                tempNode.leftNode = new Node<E>(key);
                break;
            }
            else if (tempNode.rightNode == null) {
                tempNode.rightNode = new Node<E>(key);
                break;
            } else {
                nodeQueue.poll();
                nodeQueue.add(tempNode.leftNode);
                nodeQueue.add(tempNode.rightNode);
            }
        }
    }

}
