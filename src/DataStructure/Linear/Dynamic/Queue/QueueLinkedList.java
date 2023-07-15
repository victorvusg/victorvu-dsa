package DataStructure.Linear.Dynamic.Queue;

import java.util.LinkedList;

public class QueueLinkedList<E> {

    private final LinkedList<E> values;

    private int size;


    public QueueLinkedList() {
        this.size = 0;
        this.values = new LinkedList<E>();
    }

    public void enqueue(E value) {
        this.values.addLast(value);
        this.size++;
    }

    public void dequeue() throws Exception {
        if (this.size == 0) throw new Exception("Empty queue");
        this.values.removeFirst();
        this.size--;
    }

    public String toString() {
        return this.values.toString();
    }

    public int size() {
        return this.size;
    }

    public E front() {
        return this.values.getFirst();
    }

    public E rear() {
        return this.values.getLast();
    }

}
