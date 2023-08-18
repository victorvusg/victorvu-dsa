package DataStructure.NonLinear.Heap;

import java.util.Arrays;

public class Heap {

    public int[] values;

    public int capacity = 0;
    public int lastIndex = -1;
    public static void main(String[] args) throws Exception {
        //
        Heap test = new Heap(10);
        test.insert(1);
        test.insert(2);
        test.insert(3);
        test.insert(0);
        test.insert(4);
        test.insert(4);
        test.insert(4);
        test.insert(4);

        test.delete();
        test.delete();
        test.delete();


        System.out.println(Arrays.toString(test.getValues()));
    }

    public Heap(int capacity) {
        this.capacity = capacity;
        this.values = new int[capacity];
    }

    public void insert(int value) throws Exception {
        if (this.lastIndex == this.capacity - 1) throw new Exception("Heap is full!");
        this.lastIndex++;
        this.values[lastIndex] = value;
        this.heapifyUpward(lastIndex);
    }

    public void delete() throws Exception {
        if (this.lastIndex == -1) throw new Exception("Heap is empty!");
        int temp = this.values[0];
        this.values[0] = this.values[lastIndex];
        this.values[lastIndex] = temp;
        this.lastIndex--;
        this.heapifyDownward(0);
    }

    public int[] getValues() {
        return Arrays.copyOf(this.values, this.lastIndex + 1);
    }

    public void heapifyDownward(int index) {
        int leftChildIndex = (index + 1) * 2 - 1;
        int rightChildIndex = (index + 1) * 2;

        if (leftChildIndex > this.lastIndex) return;

        int temp = this.values[index];

        if (rightChildIndex > this.lastIndex || this.values[leftChildIndex] < this.values[rightChildIndex]) {
            this.values[index] = this.values[leftChildIndex];
            this.values[leftChildIndex] = temp;
            this.heapifyDownward(leftChildIndex);
        } else {
            this.values[index] = this.values[rightChildIndex];
            this.values[rightChildIndex] = temp;
            this.heapifyDownward(rightChildIndex);
        }


    }


    public void heapifyUpward(int index) {
        int parent = (index + 1) / 2 - 1;
        if (parent < 0 || this.values[index] >= this.values[parent]) return;

        int temp = this.values[index];
        this.values[index] = this.values[parent];
        this.values[parent] = temp;

        heapifyUpward(parent);
    }
}
