package DataStructure.Linear.Dynamic.Queue;
import java.util.Arrays;

public class QueueArray {

    public int[] values;

    private final int cap;

    private int size;

    private int front;

    private int rear;

    public QueueArray (int cap) {
        this.cap = cap;
        this.values = new int[cap];
        this.front = this.rear = -1;
        this.size = 0;
    }

    public void enqueue(int value) throws StackOverflowError {
        if (size == cap) throw new StackOverflowError("Overflow");

        this.size ++;

        if (front == -1) {
            // When the queue is empty
            this.front = this.rear = 0;
        } else {
            // When the queue is not empty
            this.rear = (this.rear + 1) % this.cap;
        }
        this.values[rear] = value;
    }

    public int dequeue() throws Exception {
        if (this.size == 0) throw new Exception("Empty queue");

        int tempValue = this.values[this.front];

        if (this.front == this.rear) {
            this.front = this.rear = -1;
        } else {
            this.front = (this.front + 1) % this.cap;
        }

        size--;

        return tempValue;
    }

    public String toString() {
        if (size == 0) return "[]";

        int[] queueArray = new int[size];
        if (this.front <= this.rear) {
            queueArray = Arrays.copyOfRange(this.values, this.front, this.rear + 1);
        } else {
            System.arraycopy(this.values, this.front, queueArray, 0, cap - this.front);
            System.arraycopy(this.values, 0, queueArray, cap - this.front, this.rear + 1);
        }

        return Arrays.toString(queueArray);
    }

    public int size() {
        return this.size;
    }

    public int front() {
        return this.front;
    }

    public int rear() {
        return this.rear;
    }

}
