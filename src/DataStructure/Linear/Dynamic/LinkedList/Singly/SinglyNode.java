package DataStructure.Linear.Dynamic.LinkedList.Singly;

import DataStructure.Linear.Dynamic.LinkedList.BaseNode;

class SinglyNode<E> extends BaseNode<E> implements SinglyNodeInterface<E> {

    public SinglyNode(E value) {
        this.setValue(value);
        this.setNextNode(null);
    }

    @Override
    public void setValue(E value) {
        this.value = value;
    }

    @Override
    public void setNextNode(SinglyNode<E> node) {
        this.nextNode = node;
    }

}