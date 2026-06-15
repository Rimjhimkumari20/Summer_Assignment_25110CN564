import java.util.Scanner;

public class Q4{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Array Elements:");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }

        System.out.print("After Moving Zeroes to end: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}