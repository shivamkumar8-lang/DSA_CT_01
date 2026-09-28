//Write a program to delete an element from a given position.
import java.util.Scanner;

public class Array_07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[100];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter position: ");
        int pos = sc.nextInt();

        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        n--;

        System.out.println("Array after deletion:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
