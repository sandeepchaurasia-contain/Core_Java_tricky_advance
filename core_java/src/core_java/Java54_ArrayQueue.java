package core_java;
import java.util.*;


class ArrayQueue {
    private int[] queue;
    private int front, rear, size, capacity;

    // Constructor
    ArrayQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Check empty
    boolean isEmpty() {
        return size == 0;
    }

    // Check full
    boolean isFull() {
        return size == capacity;
    }

    // Enqueue
    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = data;
        size++;
        System.out.println(data + " inserted");
    }

    // Dequeue
    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int removed = queue[front];
        front = (front + 1) % capacity;
        size--;
        return removed;
    }

    // Peek
    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[front];
    }

    // Size
    int size() {
        return size;
    }
}

class Java54_ArrayQueue {
    public static void main(String[] args) {

        ArrayQueue q = new ArrayQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Front element: " + q.peek());
        System.out.println("Removed element: " + q.dequeue());

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60); // Queue Full

        System.out.println("Queue size: " + q.size());
    }
}

