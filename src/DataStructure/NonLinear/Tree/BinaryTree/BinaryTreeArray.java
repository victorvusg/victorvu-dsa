package DataStructure.NonLinear.Tree.BinaryTree;

public class BinaryTreeArray {

    private int size;

    private int[] values;

    public BinaryTreeArray(int size, int rootValue) {
        this.size = size;
        this.values = new int[size];
        this.values[0] = rootValue;
    }

    public void add(int rootKey, int value, Side side) throws Exception {
        int nextNodeKey = (rootKey * 2) + (side == Side.LEFT ? 1 : 2);
        if (nextNodeKey < size)
            this.values[nextNodeKey] = value;
        else
            throw new Exception("Oversize");
    }

    public int[] getValues() {
        return values;
    }
}
