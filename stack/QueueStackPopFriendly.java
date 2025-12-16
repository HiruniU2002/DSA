package QueueStackPopFriendly;

import java.util.LinkedList;
import java.util.Queue;
import java.util.NoSuchElementException;

public class QueueStackPopFriendly {

    private Queue<Integer> primary;
    private Queue<Integer> secondary;

    public QueueStackPopFriendly() {
        primary = new LinkedList<>();
        secondary = new LinkedList<>();
    }

    public void push(int value) {
       
        secondary.offer(value);

        while (!primary.isEmpty()) {
            secondary.offer(primary.poll());
        }

       
        Queue<Integer> temp = primary;
        primary = secondary;
        secondary = temp;
    }

  
    public int pop() {
        if (primary.isEmpty()) {
            throw new NoSuchElementException("Stack is Empty!");
        }
        return primary.poll();
    }

   
    public int peek() {
        if (primary.isEmpty()) {
            throw new NoSuchElementException("Stack is Empty!");
        }
        return primary.peek();
    }

    
    public boolean empty() {
        return primary.isEmpty();
    }

    public static void main(String[] args) {

        QueueStackPopFriendly stack = new QueueStackPopFriendly();

        System.out.println("Queue Stack - Pop Friendly\n");

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

            System.out.println("Pop : " + stack.pop());
            System.out.println("[2]");
            System.out.println("Pop : " + stack.pop());

        } catch (NoSuchElementException e) {
            System.out.println("Cannot pop – stack is empty.");
        }

        System.out.println("isEmpty : " + stack.empty());
    }
}
