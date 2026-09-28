//10.Write a program to count even and odd numbers.
public class Array_10 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int count_even = 0;
        int count_odd = 0;

        for(int ele : arr){
            if(ele % 2 == 0){
                count_even++;
            }
            else{
                count_odd++;
            }
        }

        System.out.println("No of even element: " + count_even);
        System.out.println("No of Odd element: " + count_odd);
    }
}
