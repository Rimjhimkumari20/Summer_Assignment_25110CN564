import java.util.Scanner;

public class Q4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int size = sc.nextInt();
        int c = 0;

        int[] arr = new int[size];

        System.out.println("Enter Array Elements: ");

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Duplicate Elements is: ");
        for(int i=0;i<size;i++){
            c=0;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    c = 1;
                    break;
                }
            }
            if(c == 1){
                continue;
            }

            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
            }
        }
    }