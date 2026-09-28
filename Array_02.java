// 2.Write a program to calculate the sum of all array elements.

import java.util.Scanner;

public class Array_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3,4,5};

        int sum = 0;

        for(int ele : arr){
            sum += ele;
        }
        
        System.out.println(sum);
    }
}

