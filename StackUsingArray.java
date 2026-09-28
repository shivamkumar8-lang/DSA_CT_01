class Stack{
    int[] arr = new int[100];
    int top = -1;
    

    // IsEmpty()

    boolean isEmpty(){
       return top == -1;
    }

    // IsFull()
    boolean isFull(){
        return top == arr.length-1;
    }

    // push()

    void push(int x){
        if(isFull()){
            System.out.println("Stack Overflow");
            return;
        }
        top += 1;
        arr[top] = x;

    }

    // Pop()

    int pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top--];
    }

    // peek() operation you can say top of the stack

    int peek(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top];
    }

    // Display()

    void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        for(int i = top; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
public class StackUsingArray {
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
