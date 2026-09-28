import java.util.Scanner;

class Stack {
    char[] arr = new char[100];
    int top = -1;

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == arr.length - 1;
    }

    void push(char x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }

        arr[++top] = x;
    }

    char pop() {
        if (isEmpty()) {
            return '\0';
        }

        return arr[top--];
    }
}

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        Stack s = new Stack();

        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        System.out.print("Reversed string: ");

        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }
    }
}
