import java.util.Scanner;

public class Array_05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 10, 16, 200};

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;

        for (int ele : arr) {
            if (ele == key) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }
    }
}
