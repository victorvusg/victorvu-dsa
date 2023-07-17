package DataStructure.NonLinear.Tree.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        //
        BinaryTreeSearch tree = initialise();
        tree.insert(7);
        tree.insert(-1);
        tree.insert(72);
        tree.insert(7734);
        tree.insert(0);
        tree.insert(0);

        tree.inOrderTraverse();
//        tree.printNodeAtLevel(0);
    }

    /**
     *                                7734
     *                                         5
     *                7            7
     * @return
     */
    static BinaryTreeSearch initialise() {
        BinaryTreeSearch tree = new BinaryTreeSearch(10);

        tree.root.left = new Node<>(5);
        tree.root.right = new Node<>(15);

        return tree;
    }
}
