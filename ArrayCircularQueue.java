package ArrayCircularQueue;

public class ArrayCircularQueue {

    private int[] queue;
    private int front, rear, size, capacity;

    public ArrayCircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

   
    public void enqueue(int x) {
        if (size == capacity) {
            System.out.println("Queue is Full");
            return;
        }

        rear = (rear + 1) % capacity;
        queue[rear] = x;
        size++;
    }

    
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int value = queue[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }

    public static void main(String[] args) {

        ArrayCircularQueue q = new ArrayCircularQueue(5);

        System.out.println("Array Circular Queue\n");

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        System.out.println("Dequeue : " + q.dequeue());
        System.out.println("Dequeue : " + q.dequeue());

        q.enqueue(5);
        q.enqueue(6);

        System.out.println("Dequeue : " + q.dequeue());
    }
}
