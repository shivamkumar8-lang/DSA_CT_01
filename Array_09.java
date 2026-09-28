// 9.Write a program to merge two arrays.

import java.util.Scanner;

public class Array_09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];

        System.out.println("Enter elements of first array:");

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        System.out.println("Enter elements of second array:");

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        

        int[] arr3 = new int[n1 + n2];

        for (int i = 0; i < n1; i++) {
            arr3[i] = arr1[i];
        }

        for (int i = 0; i < n2; i++) {
            arr3[n1 + i] = arr2[i];
        }

        System.out.println("Merged Array:");

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
