class Queue{
    int[] arr = new int[100];
    int front = 0;
    int rear = -1;

    // isEmpty()

    boolean isEmpty(){
        return rear < front;
    }

    // isFull()

    boolean isFull(){
        return rear == arr.length-1;
    }

    // push() --> enqueue 

    void enqueue(int x){
        if(isFull()){
            System.out.println("Queue overflow");
            return;
        }
        rear += 1;
        arr[rear] = x;
    }

    // dequeue --> pop()

    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue underflow");
            return -1;
        }

        return arr[front++];
    }

    // peek() mean top/ front element of queue

    int top(){
        if(isEmpty()){
            System.out.println("Queue underflow");
            return -1;
        }
        return arr[front];
    }

    // display()

    void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        for(int i = front; i <= rear; i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }
}
public class QueueUsingArray {
    public static void main(String[] args){
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
