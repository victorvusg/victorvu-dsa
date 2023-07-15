package DataStructure.Linear.Dynamic.Stack;

import java.util.ArrayList;

public class ArrayStack<E> {

    private final ArrayList<E> values;

    public int top = -1;

    public ArrayStack() {
        this.values = new ArrayList<>();
    }

    public void push(E value) {
        values.add(value);
        top++;
    }

    public E pop() {
        int lastIndex = values.size() - 1;

        E value = this.values.get(lastIndex);
        this.values.remove(lastIndex);

        top--;
        return value;
    }

    public E peek() throws NullPointerException {
        if (top == -1) throw new NullPointerException("Empty stack");
        else {
            return this.values.get(values.size() - 1);
        }
    }

    public String toString() {
        return this.values.toString();
    }

}
