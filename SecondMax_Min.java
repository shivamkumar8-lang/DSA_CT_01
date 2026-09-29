// write a program to find secondMax and SecondMinimum
import java.util.*;
public class SecondMax_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int Smax = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;
        int Smin = Integer.MAX_VALUE;

        for(int ele : arr){
            if(ele > max){
                Smax = max;
                max = ele;
            }
            else if(ele > Smax && ele != max){
                Smax = ele;
            }

            // for Second Minimum 
            if(ele < min){
                Smin = min;
                min = ele;
            }
            else if(ele < Smin && ele != min){
                Smin = ele;
            }
        }

        System.out.println("Second Maximum is : " + Smax);
        System.out.println("Second Minimum is : " + Smin);
    }
}
