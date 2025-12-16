package QueueStackPushFriendly;

import java.util.LinkedList;
import java.util.Queue;
import java.util.NoSuchElementException;

public class QueueStackPushFriendly {

    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public QueueStackPushFriendly() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

   
    public void push(int value) {
        q1.offer(value);
    }

 
    public int pop() {
        if (q1.isEmpty()) {
            throw new NoSuchElementException("Stack is Empty!");
        }

        
        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }

        int poppedValue = q1.poll();

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return poppedValue;
    }

    public boolean empty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {

        QueueStackPushFriendly stack = new QueueStackPushFriendly();

        System.out.println("Queue Stack - Push Friendly\n");

        System.out.println("isEmpty : " + stack.empty());

        stack.push(2);
        System.out.println("Push : 2");

        stack.push(4);
        System.out.println("Push : 4");

        stack.push(6);
        System.out.println("Push : 6");
        
        System.out.println("[2, 4 , 6]");

        try {
            System.out.println("Pop : " + stack.pop());
            System.out.println("[2, 4]");
            System.out.println("Pop : " + stack.pop());
            System.out.println("[2]");

            stack.push(9);
            System.out.println("Push : 9");
            System.out.println("[2, 9]");
            
            System.out.println("push : 8");
            System.out.println("[2, 9, 8]");
            

        } catch (NoSuchElementException e) {
            System.out.println("Cannot pop – stack is empty.");
        }

        System.out.println("isEmpty : " + stack.empty());
    }
}
