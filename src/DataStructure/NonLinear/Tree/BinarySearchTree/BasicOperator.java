package DataStructure.NonLinear.Tree.BinarySearchTree;

import java.util.*;

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
            } else if (value > current.val) {
                if (current.right != null) {
                    current = current.right;
                } else {
                    current.right = new Node<>(value);
                    current = null;
                }
            } else {
                current = null;
            }

        }
    }

    void inOrderTraverse();

    default void inOrderTraverse(Node<Integer> node) {
        if (node == null) return;

        inOrderTraverse(node.left);
        System.out.println(node.val + " ");
        inOrderTraverse(node.right);

    }

    default void findAllNodesAtLevel(Node<Integer> root, int level, List<Node<Integer>> nodes) {
        Queue<Node<Integer>> queue = new LinkedList<>();
        queue.add(root);
        int currentLevel = 0;
        while (!queue.isEmpty()) {
            Node<Integer> node = queue.poll();
            if (currentLevel == level) {
                nodes.add(node);
            }
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
            currentLevel++;
        }
    }

    void printNodeAtLevel(int level);

    default void printNodeAtLevel(int level, Node<Integer> rootNode) {
        if (rootNode == null || level < 0) {
            System.out.println("Invalid");
            return;
        }

        Queue<Node<Integer>> childNode = new LinkedList<>();
        childNode.add(rootNode);
        int currentLevel = 0;

        while (childNode.size() > 0 && currentLevel <= level) {
            Node<Integer> temp = childNode.poll();
            if (temp.left != null) childNode.add(temp.left);
            if (temp.right != null) childNode.add(temp.right);
            currentLevel++;
        }
    }
}
