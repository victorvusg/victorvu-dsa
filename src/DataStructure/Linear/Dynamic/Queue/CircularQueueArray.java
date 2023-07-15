package DataStructure.Linear.Dynamic.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CircularQueueArray {

    public int front;

    public int rear;

    public int capacity;

    public int size;

    public ArrayList<Integer> values;

    public static void main(String[] args) {
        //
    }

    public CircularQueueArray(int capacity) {
        this.capacity = capacity;
        this.front = this.rear = -1;
        this.size = 0;
        this.values = new ArrayList<Integer>(capacity);
    }

    public void enQueue (int value) throws Exception{
        // In general: rear += 1

        // If the queue is full
        if (this.size == this.capacity) {
            throw new Exception ("The queue is full");
        }
        // If the queue is empty
        else if (this.size == 0) {
            this.front = this.rear = 0;
            this.values.add(0, value);
            this.size++;
        }
        // If rear is at the end of queue but the front is not 0
        else if (this.rear == this.capacity - 1 && front != 0) {
            this.rear = 0;
            this.values.set(0, value);
            this.size++;
        } else {
            this.rear++;
            if (this.rear > this.front) {
                this.values.add(this.rear, value);
            } else {
                this.values.set(this.rear, value);
            }
            this.size++;
        }
    }


    public void deQueue () throws Exception {
        // In general, increase front by 1

        // If queue is empty
        if (this.size == 0) {
            throw new Exception("The queue is empty");
        } else if (rear == front) {
            this.front = this.rear = -1;
            this.size--;
        } else if (this.front == this.capacity - 1) {
            this.front = 0;
            this.size--;
        }
        else {
            front++;
            this.size--;
        }
    }

    public int front() {
        if (this.size > 0)
            return this.front;
        return -1;
    }

    public int rear() {
        if (this.size > 0)
            return this.rear;
        return -1;
    }

    public List<Integer> getValues() {
        if (this.size == 0) return new LinkedList<Integer>();
        if (this.rear >= this.front) {
            return this.values.subList(this.front, this.rear + 1);
        } else {
            List<Integer> temp = new ArrayList<Integer>();
            temp = this.values.subList(this.front, this.capacity);
            temp.addAll(this.values.subList(0, this.rear + 1));
            return temp;
        }
    }
}
