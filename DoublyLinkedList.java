public class DoublyLinkedList {

    // Node Structure  
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    //Data Member
    private Node head;
    private Node tail;
    private int size;

    DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // 1. Insert At Head
    public void insertAtHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;

        //Increase size By 1
        size++;
    }

    // 2. Insert At Tail
    public void insertAtTail(int val) {
        Node newNode = new Node(val);
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

        size++;
    }

    // 3. Insert At Position (1-based index)
    public void insertAtPosition(int val, int position) {
        if(position < 1 || position > size + 1){
            System.out.println("Invalid Position to Insert Node");
            return;
        }

        if(position == 1){
            insertAtHead(val);
            return;
        }

        if(position == size + 1){
            insertAtTail(val);
            return;
        }

        Node temp = head;

        for(int i = 1; i <=position-2; i++){
            temp = temp.next;
        }

       // ab temp prevNode par aa chuka hai

        Node preNode = temp;
        Node nextNode = preNode.next;
        Node currNode = new Node(val);

        // ab Change Links
        currNode.prev = preNode;
        preNode.next = currNode;
        currNode.next = nextNode;
        nextNode.prev = currNode;

        size++;

    }


    // 4. Traversal (Forward & Backward)
//    public void printForward() {
//        Node temp = head;
//        System.out.print("Forward Traversal : ");
//        while (temp != null) {
//            System.out.print(temp.data + " <-> ");
//            temp = temp.next;
//        }
//        System.out.println("null");
//    }
//
//    public void printBackward() {
//        Node temp = tail;
//        System.out.print("Backward Traversal: ");
//        while (temp != null) {
//            System.out.print(temp.data + " <-> ");
//            temp = temp.prev;
//        }
//        System.out.println("null");
//    }


    // Print The List

    public void printListy(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;

        }
        System.out.println();
    }


    public void printBackward(){
        Node temp = tail;
        while(temp != null){
            System.out.print("<-" + temp.data);
            temp = temp.prev;
        }
        System.out.println();
    }

    // 5. Search an Element
    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) return true;
            temp = temp.next;
        }
        return false;
    }

    // 6. Updation in LL
    public boolean update(int oldVal, int newVal) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == oldVal) {
                temp.data = newVal;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // 7. Delete Head
    public void deleteHead() {
        if (head == null) return;

        if (head == tail) { // Single node case
            head = tail = null;
            size = 0;
            return;
        }

        head = head.next;
        head.prev = null;
        size--;
    }

    // 8. Delete Tail
    public void deleteTail() {
        if (tail == null) return;

        if (head == tail) { // Single node case
            head = tail = null;
            size = 0;
            return;
        }

        tail = tail.prev;
        tail.next = null;
        size--;
    }

    // 9. Delete At Position (1-based index)
    public void deleteAtPosition(int position){
             if(position < 1 || position > size + 1){
                 System.out.println("It is not a Valid Case You cannot delete a Node");
                 return;
             }

             if(position == 1){
                 deleteHead();
                 return;
             }
             if( position  == size + 1){
                 deleteTail();
                 return;
             }

             // Main Logic
            Node currNode= head;

             for(int  i = 1; i < position-1; i++){
                 currNode = currNode.next;
             }

             Node prevNode = currNode.prev;
             Node nextNode = currNode.next;


             // change Links

            prevNode.next = nextNode;
            nextNode.prev = prevNode;
            currNode.prev = null;
            currNode.next = null;

            size--;
    }

    // Driver Code to test everything!
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Insertion

        list.insertAtHead(10);
        list.printListy();
        list.insertAtHead(20);
        list.printListy();
        list.insertAtHead(30);
        list.printListy();

        list.insertAtTail(100);
        list.printListy();
        list.insertAtTail(110);
        list.printListy();
        list.insertAtTail(120);
        list.printListy();

       // Insert at a Position
        list.insertAtPosition(23,3);
        list.printListy();

        //Backward

        list.printBackward();

        // Search a Element

        System.out.println("Found or Not: " + list.search(500));

        // Update old Val to new Value
        list.update(23,4);
        list.printListy();

        // Delete
        list.deleteHead();
        list.printListy();
        list.printBackward();

        list.deleteTail();
        list.printListy();
        list.deleteTail();
        list.printListy();
        list.deleteTail();
        list.printListy();

        // Delete at a Position

         list.deleteAtPosition(3);
         list.printListy();

        list.deleteAtPosition(2);
        list.printListy();


    }
}