import java.util.Scanner;

public class Q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter array elements: ");
        int sum = 0;
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        
        int avg = sum/size ;
       
        System.out.println("The sum Of an array is: " +sum);
        System.out.println("Average of an array is: " +avg);
    }
}