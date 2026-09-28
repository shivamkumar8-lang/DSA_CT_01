/*
For the polynomial:

5x³ + 2x² + 7x + 4

we can store the coefficients in an array according to their exponents.

Exponent:   3   2   1   0
Coefficient: 5   2   7   4

So the array is:

int[] poly = {5, 2, 7, 4};


*/

import java.util.*;

public class Polynomial_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] poly = new int[n];

        for (int i = 0; i < n; i++) {
            poly[i] = sc.nextInt();
        }

        System.out.println("Polynomial: ");

        for (int i = 0; i < n; i++) {

            int power = (n - 1) - i;

            if (poly[i] != 0) {

                if (i > 0 && poly[i] > 0) {
                    System.out.print(" + ");
                }

                if (power == 0) {
                    System.out.print(poly[i]);
                }
                else if (power == 1) {
                    System.out.print(poly[i] + "x");
                }
                else {
                    System.out.print(poly[i] + "x^" + power);
                }
            }
        }
    }
}
