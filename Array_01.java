//Write a Java program to create an array of five integers and display all elements.

import java.util.*;
public class Array_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3,4,5};

        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
