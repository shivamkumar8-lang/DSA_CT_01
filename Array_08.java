import java.util.*;
public class Array_08 {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};


        System.out.println("Before Reverse: ");

        for(int ele : arr){
            System.out.print(ele + " ");
        }

        int i = 0;
        int j = arr.length-1;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        
        System.out.println();
        System.out.println("After Reverse: ");

        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
