class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {

    Node head = null;
    Node tail = null;

    // isEmpty()

    boolean isEmpty() {
        return head == null;
    }

    // insert()

    void insert(int x) {
        Node newNode = new Node(x);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // display()

    void display() {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }
}

public class CircularLinkedListUsingJava {
    public static void main(String[] args) {

        CircularLinkedList list = new CircularLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.display();
    }
}
