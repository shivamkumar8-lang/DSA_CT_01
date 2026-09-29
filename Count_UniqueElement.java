// Count Unique Element in array

import java.util.Scanner;
import java.util.HashSet;
public class Count_UniqueElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for(int ele : arr){
            set.add(ele);
        }
        System.out.println("Unique element count : " + set.size());
    }
}
