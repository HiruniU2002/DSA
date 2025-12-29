package SinglyLinkedList;

public class SinglyLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Delete first node
    public void delete() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
    }

    // Display list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        System.out.println("Singly Linked List\n");

        list.insert(5);
        list.insert(10);
        list.insert(15);

        list.display();

        list.delete();
        list.display();
    }
}
