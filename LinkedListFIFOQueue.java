/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LinkedListFIFOQueue;

/**
 *
 * @author User
 */
public class LinkedListFIFOQueue {

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
      private Node front,rear;
      
      //Enqueue
      public void enqueue(int data){
          Node newNode = new Node(data);
          
          if(rear == null){
              front = rear = newNode;
              return;
          }
          rear.next = newNode;
          rear = newNode;
      }
      
      //Dequeue
      public int dequeue(){
          if(front == null){
              System.out.println("Queue is Empty");
              return -1;
          }
          
          int value = front.data;
          front = front.next;
          
          if(front == null){
              rear = null;
          }
          return value;
      }

    public static void main(String[] args) {
        // TODO code application logic here
        LinkedListFIFOQueue q = new LinkedListFIFOQueue();
       
        System.out.println("LinkedListFIFOQueue\n");
        
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(9);
        
        System.out.println("Dequeue : " + q.dequeue());
        System.out.println("Dequeue : " +q.dequeue());
    }
    
}
