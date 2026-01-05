/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LinkedListStack;

/**
 *
 * @author User
 */
public class LinkedListStack {

    /**
     * @param args the command line arguments
     */
    class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    private Node top;
    
    //push
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
    //pop
    public int pop(){
        if(top == null){
            System.out.println("Stack is Empty");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }
    
    //peek operation
    public int peek(){
        if(top == null){
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        LinkedListStack stack = new LinkedListStack();
        System.out.println("Linked List Stack\n");
        
        stack.push(5);
        stack.push(6);
        stack.push(7);
        
        System.out.println("Pop : " + stack.pop());
        System.out.println("Peek : " + stack.peek());
    }
    
}
