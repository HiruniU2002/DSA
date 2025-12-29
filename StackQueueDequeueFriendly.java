package StackQueueDequeueFriendly;

import java.util.LinkedList;
import java.util.Queue;
import java.util.NoSuchElementException;

public class StackQueueDequeueFriendly {

    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public StackQueueDequeueFriendly() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    
    public void push(int x) {
        q2.add(x);

        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

   
    public int pop() {
        if (q1.isEmpty()) {
            throw new NoSuchElementException("Stack is Empty!");
        }
        return q1.remove();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {

        StackQueueDequeueFriendly s = new StackQueueDequeueFriendly();

        System.out.println("StackQueue - Dequeue Friendly\n");

        s.push(10);
        System.out.println("Push : 10");
        s.push(20);
        System.out.println("Push : 20");
        s.push(30);
        System.out.println("Push : 30");

        System.out.println("Pop : " + s.pop());
        System.out.println("Pop : " + s.pop());

        System.out.println("isEmpty : " + s.isEmpty());
    }
}
