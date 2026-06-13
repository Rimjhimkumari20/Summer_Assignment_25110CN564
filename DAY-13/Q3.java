import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter array Elements: ");

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        int smallest = arr[0];
         for(int i=0;i<size;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
            if(arr[i]<smallest){
                smallest = arr[i];
            }
         }

        System.out.println("Largest Elements = " +largest);
        System.out.println("Smallest Elements = " +smallest);
    }
    
}
