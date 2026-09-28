//Write a program to insert an element at a given position.

import java.util.Scanner;

public class Array_06 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[100];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter position: ");
        int pos = sc.nextInt();

        System.out.print("Enter element: ");
        int element = sc.nextInt();

        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        arr[pos] = element;
        n++;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        } 
   }
}
