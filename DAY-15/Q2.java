import java.util.Scanner;

public class Q2{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Array Elements:");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int first = arr[0];

        for(int i=0;i<n-1;i++){
            arr[i] = arr[i+1];
        }

        arr[n-1] = first;

        System.out.print("Array after left Rotation: ");

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}