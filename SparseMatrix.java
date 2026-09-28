import java.util.Scanner;
public class SparseMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        
        System.out.println("Matrix Input: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Checked for sparse Matrix: ");
        int zero = 0;
        int nonZero = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                if (arr[i][j] == 0) {
                    zero++;
                } else {
                    nonZero++;
                }
            }
        }
        

        System.out.println("No of zeros: " + zero);

        System.out.println("No of non_Zero: " + nonZero);


        if(zero > nonZero){
            System.out.println("It is a Sparse Matrix");
        }
        else{
            System.out.println("It is not a sparse Matrix");
        }
    }
}
