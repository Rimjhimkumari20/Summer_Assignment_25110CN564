import java.util.Scanner;

public class Q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int sum = 0;

        System.out.println("Enter Array Elements: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
            sum+= arr[i];
        }

        int n = size + 1;

        int TotalSum = n*(n+1)/2;
        
        int missing = TotalSum - sum ;
        System.out.println("Missing Number = " +missing);

    }
}   