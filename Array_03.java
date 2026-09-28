//3.Write a program to find the maximum element in an array.

import java.util.Scanner;

public class Array_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3,4,5,10,16,200};

        int max = Integer.MIN_VALUE;

        for(int ele : arr){
            if(ele > max){
                max = ele;
            }
        }
        
        System.out.println(max);
    }
}

