package DoublyLinkedList;

public class DoublyLinkedList {

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
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
        newNode.prev = temp;
    }

    // Delete first node
    public void delete() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        head = head.next;
        if (head != null) {
            head.prev = null;
        }
    }

    // Display list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        System.out.println("Doubly Linked List\n");

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.display();

        list.delete();
        list.display();
    }
}
