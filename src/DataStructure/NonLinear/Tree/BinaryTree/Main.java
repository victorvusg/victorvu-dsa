package DataStructure.NonLinear.Tree.BinaryTree;

import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BinaryTree<Integer> tree = initialise();
        /**
         * @params
         *                                  10
         *                          /               \
         *                  30                                 20
         *          400            300                700               500
         *
         *                                       49               3000
         *
         *                                             39                  17
         *
         *
         */

        tree.inOrderTraversalUsingMorrisTraversal();
    }

    public static BinaryTree<Integer> initialise() {
        BinaryTree<Integer> tree = new BinaryTree<>(10);
        tree.root.leftNode = new Node<>(30);
        tree.root.rightNode = new Node<>(20);

        tree.root.leftNode.leftNode = new Node<>(400);
        tree.root.leftNode.rightNode = new Node<>(300);

        tree.root.rightNode.leftNode = new Node<>(700);
        tree.root.rightNode.rightNode = new Node<>(500);

        tree.root.rightNode.rightNode.leftNode = new Node<>(3000);

        tree.root.rightNode.rightNode.leftNode.rightNode = new Node<>(17);

        tree.root.rightNode.leftNode.leftNode = new Node<>(49);

        tree.root.rightNode.leftNode.leftNode.rightNode = new Node<>(39);
        return tree;
    }
}
