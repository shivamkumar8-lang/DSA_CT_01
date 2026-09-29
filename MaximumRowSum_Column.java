import java.util.*;
public class MaximumRowSum_Column {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        int RMaxSum = 0;
        int CMaxSum = 0;

        int RMaxIndex = 0;
        int CMaxIndex = 0;

        for(int i = 0; i < r; i++){
            int current = 0;
            for(int j = 0; j < c; j++){
                current += arr[i][j];
            }

            if(current > RMaxSum){
                RMaxSum = current;
                RMaxIndex = i;
            }
        }

        for(int j = 0; j < c; j++){
            int current = 0;
            for(int i = 0; i < c; i++){
                current += arr[i][j];
            }

            if(current > CMaxSum){
                CMaxSum = current;
                CMaxIndex = j;
            }
        }

        System.out.println("Row Index with Maximum Sum and Value: " + RMaxIndex + " and " + RMaxSum);
        System.out.println("Column Index with Maximum Sum and Value: " + CMaxIndex + " and " + CMaxSum);
    }
}
