package DataStructure.NonLinear.Tree.BinaryTree;

import java.util.*;

public class BinaryTree<E> implements
        BasicOperator<E>,
        InOrderTraversal<E>,
        PreOrderTraversal<E>,
        PostOrderTraversal<E>,
        LevelOrderTraverse<E>
{

    public Node<E> root;

    public BinaryTree(E key) {
        this.root = new Node<E>(key);
    }

    public BinaryTree() {
        this.root = null;
    }

    // In Order Traversal =====================
    void inOrderTraverseWithRecursion() {
        this.inOrderTraverseWithRecursion(this.root);
    }

    void inOrderTraversalWithoutRecursionUsingStack() {
        inOrderTraversalWithoutRecursionUsingStack(this.root);
    }

    void inOrderTraversalUsingMorrisTraversal() {
        this.inOrderTraversalUsingMorrisTraversal(this.root);
    }

    // Pre Order Traversal =====================
    void preOrderTraverseRecursion() {
        this.preOrderTraverseRecursion(this.root);
    }



    // Post Order Traversal =====================
    void postOrderTraverse() {
        this.postOrderTraverse(this.root);
    }




    // Level Order Traversal =====================


    void levelOrderTraverseRecursion() {
        this.levelOrderTraverseRecursion(new ArrayList<Node<E>>(List.of(this.root)));
    }

    void levelOrderTraverseSpiralForm() {
        this.levelOrderTraverseSpiralForm(new ArrayDeque<Node<E>>(List.of(this.root)), 0);
    }

    void levelOrderTraversalWithoutRecursion() {
        levelOrderTraversalWithoutRecursion(this.root);
    }


    Stack<Node<Integer>> reverseLevelOrderTraversal() {
        this.reverseLevelOrderTraversal(this.root);
        return null;
    }


    // Basic Operator =====================
    void insertLevelOrder (E key) {
        this.insertLevelOrder(key, this.root);
    }

    void insertLevelOrder_1 (E key) {
        this.insertLevelOrder_1(key, this.root);
    }

    void remove(E key) {
        this.deleteNode(this.root, key);
    }

    int getHeight() {
        return this.getHeight(this.root);
    }

}
