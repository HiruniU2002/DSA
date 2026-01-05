/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CircularDoublyLinkedList;

/**
 *
 * @author User
 */
public class CircularDoublyLinkedList {

    /**
     * @param args the command line arguments
     */
    
    class Node {
        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
            next = prev = null;
        }
    }

    private Node head;

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
            return;
        }

        Node last = head.prev;

        newNode.next = head;
        newNode.prev = last;
        last.next = newNode;
        head.prev = newNode;
    }

    // Delete first node
    public void delete() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (head.next == head) {
            head = null;
            return;
        }

        Node last = head.prev;
        head = head.next;
        head.prev = last;
        last.next = head;
    }

    // Display list
    public void display() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();

        System.out.println("Circular Doubly Linked List\n");

        list.insert(10);
        list.insert(20);
        list.insert(30);        
        list.insert(40);
        list.insert(50);

        list.display();

        list.delete();        
        list.delete();

        list.display();
    }

}
