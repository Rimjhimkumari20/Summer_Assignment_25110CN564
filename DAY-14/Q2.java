import java.util.Scanner;

public class Q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int size = sc.nextInt(); 

        int[] arr = new int[size];

        System.out.println("Enter Array Elements: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Element Whose Frequency is to be Found: ");
        int x = sc.nextInt();
        int c = 0;

        for(int i=0;i<size;i++){
            if(arr[i]==x){
                c++;
            }
        }
    System.err.print("Frequency of an given element is: " +c);
    }
}