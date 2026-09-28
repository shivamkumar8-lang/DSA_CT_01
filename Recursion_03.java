//Write a recursive program to print numbers from 1 to n.
import java.util.Scanner;
public class Recursion_03 {

    public void print(int n){
        if(n == 0){
            return;
        }
        print(n-1);

        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Recursion_03 a = new Recursion_03();
        
        a.print(n);

    }
}
