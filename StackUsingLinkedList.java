class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    Node head = null;

    // isEmpty()

    boolean isEmpty() {
        return head == null;
    }

    // push()

    void push(int x) {
        Node newNode = new Node(x);

        newNode.next = head;
        head = newNode;
    }

    // pop()

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int value = head.data;
        head = head.next;

        return value;
    }

    // peek()

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return head.data;
    }

    // display()

    void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class StackUsingLinkedList {
    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        s.pop();
        s.display();

        System.out.println(s.peek());
    }
}
