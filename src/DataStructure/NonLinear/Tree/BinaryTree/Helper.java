package DataStructure.NonLinear.Tree.BinaryTree;

public class Helper {

    public static void main(String[] args) {

    }

    public static void leftAdd(Node<Integer> node, int key) {
        node.leftNode = new Node<>(key);
        node.leftNode.leftNode = node.leftNode.rightNode = null;
    }

    public static void rightAdd(Node<Integer> node, int key) {
        node.rightNode = new Node<>(key);
        node.rightNode.leftNode = node.rightNode.rightNode = null;
    }

}
