//3.Write a program to find the minimum element in an array.

import java.util.Scanner;

public class Array_04{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3,4,5,10,16,200};

        int min = Integer.MAX_VALUE;

        for(int ele : arr){
            if(ele < min){
                min = ele;
            }
        }
        
        System.out.println(min);
    }
}

