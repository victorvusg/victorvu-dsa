package DataStructure.NonLinear.Tree.BinarySearchTree;

public class BinaryTreeSearch implements BasicOperator {

    Node<Integer> root;
    public static void main(String[] args) {
        //
    }

    public BinaryTreeSearch(int key) {
        this.root = new Node<>(key);
    }

    @Override
    public void insert(int value) {
        this.insert(value, this.root);
    }

    @Override
    public void inOrderTraverse() {
        this.inOrderTraverse(this.root);
    }

    @Override
    public void printNodeAtLevel(int level) {
        this.printNodeAtLevel(level, this.root);
    }
}
