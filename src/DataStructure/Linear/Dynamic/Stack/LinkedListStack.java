package DataStructure.Linear.Dynamic.Stack;

import java.util.LinkedList;

public class LinkedListStack<E> {
    private final LinkedList<E> values;

    public int top = -1;

    public LinkedListStack() {
        values = new LinkedList<E>();
    }

    public void push(E value) {
        values.push(value);
        top++;
    }

    public E pop(E value) {
        top--;
        return values.pop();
    }

    public String toString() {
        return values.toString();
    }

}
