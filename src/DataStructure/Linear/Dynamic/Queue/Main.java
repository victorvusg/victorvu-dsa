package DataStructure.Linear.Dynamic.Queue;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
//        implementArrayQueue();
//        implementLinkedListQueue();
        implementCircularQueueArray();
    }

    public static void implementArrayQueue() {
        QueueArray arrayQueue = new QueueArray(5);

        arrayQueue.enqueue(10);
        arrayQueue.enqueue(20);
        arrayQueue.enqueue(30);
        arrayQueue.enqueue(40);
        arrayQueue.enqueue(50);

        try {
            arrayQueue.dequeue();
            arrayQueue.dequeue();
            arrayQueue.enqueue(10);

            System.out.println(arrayQueue.toString());
            System.out.println(arrayQueue.front());
            System.out.println(arrayQueue.rear());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    public static void implementLinkedListQueue() {
        QueueLinkedList<Integer> queue = new QueueLinkedList<Integer>();
        queue.enqueue(1000);
        queue.enqueue(2000);
        queue.enqueue(3000);
        queue.enqueue(4000);
        queue.enqueue(5000);
        queue.enqueue(6000);
        queue.enqueue(7000);


        System.out.println(queue.toString());

        try {
            queue.dequeue();
            queue.dequeue();
            queue.dequeue();
            queue.dequeue();
            queue.dequeue();
            queue.dequeue();
            queue.dequeue();
        } catch (Exception ignored) {}


        System.out.println(queue.toString());
        System.out.println(queue.size());
        System.out.println(queue.front());
        System.out.println(queue.rear());

    }

    public static void implementCircularQueueArray() throws Exception {
        CircularQueueArray circular = new CircularQueueArray(9);

        circular.enQueue(10);
        circular.deQueue();
        circular.enQueue(11);
        circular.deQueue();

        circular.enQueue(12);
        circular.deQueue();

        circular.enQueue(13);
        circular.deQueue();

        circular.enQueue(14);
        circular.enQueue(15);
        circular.enQueue(16);
        circular.enQueue(17);
        circular.enQueue(18);
        circular.enQueue(19);
        circular.enQueue(20);
        circular.enQueue(21);
        circular.enQueue(22);

        circular.deQueue();
        circular.deQueue();
        circular.deQueue();
        circular.deQueue();
        circular.deQueue();
        circular.deQueue();
        circular.deQueue();

        circular.enQueue(23);
        circular.enQueue(24);
        circular.enQueue(25);
        circular.enQueue(26);
        circular.enQueue(27);
        circular.enQueue(28);
        circular.enQueue(29);

        circular.deQueue();
//        circular.deQueue();
//        circular.deQueue();



//        circular.deQueue();
        System.out.println(circular.front());
        System.out.println(circular.rear());
        System.out.println(Arrays.toString(circular.getValues().toArray()));
    }
}
