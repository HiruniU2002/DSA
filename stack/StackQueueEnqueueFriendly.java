package StackQueueEnqueueFriendly;

import java.util.NoSuchElementException;
import java.util.Stack;

public class StackQueueEnqueueFriendly {

    private Stack<Integer> s1; 
    private Stack<Integer> s2; 

    
    public StackQueueEnqueueFriendly() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

  
    public void enqueue(int x) {
        s1.push(x);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty!");
        }

       
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        int value = s2.pop();

       
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        return value;
    }

    
    public int front() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty!");
        }

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        int value = s2.peek();

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        return value;
    }

   
    public boolean isEmpty() {
        return s1.isEmpty();
    }

   
    public static void main(String[] args) {

        StackQueueEnqueueFriendly q = new StackQueueEnqueueFriendly();

        System.out.println("Stack Queue - Enqueue Friendly\n");

        System.out.println("isEmpty : " + q.isEmpty());
     
        q.enqueue(10);
        System.out.println("Enqueue : 10");

        q.enqueue(20);
        System.out.println("Enqueue : 20");

        q.enqueue(30);
        System.out.println("Enqueue : 30");

        System.out.println("Front : " + q.front());
        System.out.println("= = = = = = = =");

        System.out.println("Dequeue : " + q.dequeue());
        System.out.println("Dequeue : " + q.dequeue());

        System.out.println("Front : " + q.front());
        System.out.println("= = = = = = = =");

        System.out.println("isEmpty : " + q.isEmpty());
    }
}
