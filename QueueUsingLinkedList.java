class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    Node front = null;
    Node rear = null;

    // isEmpty()

    boolean isEmpty() {
        return front == null;
    }

    // enqueue()

    void enqueue(int x) {
        Node newNode = new Node(x);

        if (isEmpty()) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    // dequeue()

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int value = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return value;
    }

    // peek()

    int top() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }

        return front.data;
    }

    // display()

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        Node temp = front;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class QueueUsingLinkedList {
    public static void main(String[] args) {

        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();
        q.display();

        System.out.println(q.top());
    }
}
