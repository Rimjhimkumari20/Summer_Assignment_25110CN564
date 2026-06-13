import java.util.Scanner;

public class Q1{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int size = sc.nextInt();
        int[] Array = new int[size];

        System.out.println("Enter Array Elements: ");

        for(int i=0;i<size;i++){
            Array[i]= sc.nextInt();
        }
     System.out.println("Array Elements are: ");
    for(int i=0;i<size;i++){
        System.out.print(Array[i]+ " ");
    }
    }
}