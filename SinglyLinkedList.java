public class SinglyLinkedList {
    static class Node{
        int data;
        Node next;

        //Constructor
        Node(int data){
            this.data = data;
            this.next = null;

        }
    }

    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList(){
        this.head = head;
        this.tail = tail;
        this.size = size;

    }

    // =============================
    // IINSERTION
    //=============================

    // Insert at the Begining
    public void insertAthead(int data){
        //TODO
        Node newNode = new Node(data);
        // If L.L is Empty
        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        // Increase the Size By 1
        size++;
    }

    // Insert at The End Of The LinkedList
    public void insertAtTail(int data){
        //TODO
        Node newNode = new Node(data);
        // If L.L is Empty
        if(head == null && tail == null){
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        // Increase the Size By 1
        size++;
    }

    //Insert at a Position That is 1- Based Indexing
    public void insertAtPos(int pos, int data){
        if(pos < 1 || pos  > size + 1){
            //Insertion Not Posible
            System.out.println("Insertion Not Posible at This Position");
            return;
        }
        if(pos == 1){ //Head Me Insert Kardo
            insertAthead(data);
            return;
        }
        if(pos == size + 1){ // Agar Size + 1ke Equal Hai Toh Tail Me Insert Karnege
            insertAtTail(data);
            return;
        }

        // Middle Me Kahin Par Insert Karne Par
        Node prevNode = head;

        // Move PrevNode by (pos-2) steps, to reach the previous node of the LinkedList
        for(int i = 1; i <= pos -2; i++){
            prevNode = prevNode.next;
        }
        Node newNode = new Node(data);
        // update links
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        // Increment size
        size = size + 1;
    }

    //===========================
    //===========================

    //Traversal

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println();
    }
    //============================
    // Utility Function
    //============================

    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return head == null;

    }
    public int getHead(){
        if(head == null){
            return -1;
        }
        else{
            return head.data;
        }
    }
    public int getTail(){
       if(tail == null){
           return -1;
       }
       else{
           return tail.data;
       }
   }

   // Searching
   public boolean search(int target){
        Node temp = head;
        while(temp != null){
            if(temp.data == target){
                return true;
            }
            else{
                temp = temp.next;
            }
        }
        return false;
   }

   // Returns 1- Based Index Position

    public int findPosition(int target){
        Node temp = head;
        int po = 1;

        while(temp != null){
            if(temp.data  == target ){
                return po;
            }
            else{
                temp = temp.next;
                po++;
            }
        }

        return -1;
    }

    // Update Data Using Position

   public void updateAtPosition(int pos, int newData){

        // For Invalid Position

       if(pos < 1 || pos > size + 1){
           System.out.println("Invalid position given in input");
           return;
       }
        Node temp = head;

        for(int i = 1; i <= pos-1; i++){
            temp = temp.next;
        }

        temp.data = newData;
   }

   //Update  first Occurence OldValue to NewValue
   public boolean updateValue(int oldValue, int newValue){

       Node temp = head;
       while(temp != null){
           if(temp.data == oldValue){
               temp.data = newValue;
               return true;
           }
           // Move to The end For Check Another one for All The Occurence
          //           temp = temp.next;
       }
       return false;
   }

   //======================================
    // DELETION
    //======================================

    // Delete Head
    public void deleteHaed(){
        if(head == null){
            System.out.println("LL is Empty Cannot Delete AnyThing");
            return;
        }
        // Main Logic
        head = head.next;
        size--;

        // Be Caution --> check Whether after Deletion LL is Empty
        if(head == null){
            tail = null;
        }
    }

    // Delete Tail

    public void deleteTail(){
        if(head == null){
            System.out.println("LL is Empty , Cant Delete AnyThing ");
            return;
        }

        // check For Single Node

        if(head == tail){
            head = null;
            tail = null;
            size = 0;
            return;
        }

        // For Normal > 1 Length wali LL
        Node temp = head;

        for(int i = 1; i <= size - 2; i++){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    //Delete AtThe Position
    public void deleteAtPosition(int pos){
        // Invalid Case Ke Liye
        if(pos < 1 || pos > size + 1){
            System.out.println("It is  not a Valid Case so it cant delete any Node");
            return;
        }
        if(pos == 1){
            deleteHaed();
            return;
        }
        if(pos == size + 1){
            deleteTail();
            return;
        }

        Node prev = head;

        for(int i = 1; i < pos -1; i++){
            prev = prev.next;
        }

        // Prev pahuch chuka Hoga

        Node curr = prev.next;
        Node forward = curr.next;

        // Main Logic
        prev.next = forward;
        curr.next = null;

        size--;


    }

    // Delete The First Occurence Of The Value
    public boolean DeleteValue(int target){
        if(head == null){
            System.out.println("Deletion Not Possible no Nodes To Delete");
            return false;
        }
        if(head.data == target){
            deleteHaed();
            return true;
        }
        Node prev = head;
        Node Curr = head.next;

        while(Curr != null){
            if(Curr.data == target){
                Node Forward = Curr.next;

                prev.next = Forward;
                Curr.next = null;

                if(tail == Curr){
                    tail = prev;
                    // update tail
                }
                size--;
                return true;
            }
            else{
                prev = prev.next;
                Curr = Curr.next;
            }
        }
        return false;
    }

    public static void main(String[] args) {
          SinglyLinkedList myList = new SinglyLinkedList();

          if(myList.isEmpty()){
              System.out.println("List is Empty");
          }
        System.out.println("Size of LinkedList: " + myList.getSize() );

          // InsertAt Head
        myList.insertAthead(10);
        myList.printList();
        myList.insertAthead(20);
        myList.printList();
        myList.insertAthead(30);
        myList.printList();

        //  Insert at Tail
        myList.insertAtTail(100);
        myList.printList();
        myList.insertAtTail(110);
        myList.printList();
        myList.insertAtTail(120);
        myList.printList();

        // Insert At Position

        myList.insertAtPos(1,20);
        myList.printList();
        myList.insertAtPos(8, 200);
        myList.printList();
        myList.insertAtPos(4,20);
        myList.printList();

        System.out.println(myList.getHead());
        System.out.println(myList.getTail());

        System.out.println(myList.search(200));
        System.out.println("The Pos of Target is: " + myList.findPosition(200));

        myList.updateAtPosition(9,1);
        myList.printList();

        myList.updateValue(20 , 4);
        myList.printList();

// Deletion

        myList.deleteHaed();
        myList.printList();

        myList.deleteHaed();
        myList.printList();

        myList.deleteHaed();
        myList.printList();

        System.out.println("Delete Tail Of The LL ");
       myList.deleteTail();
       myList.printList();

        myList.deleteTail();
        myList.printList();

        myList.deleteTail();
        myList.printList();

        System.out.println("Delete At The Positon");

        myList.deleteAtPosition(3);
        myList.printList();


        //Delete The First Occurence Of The Value
        System.out.println("Delete The Targeted Node : 20");
        myList.DeleteValue(20);
        myList.printList();

    }
}
