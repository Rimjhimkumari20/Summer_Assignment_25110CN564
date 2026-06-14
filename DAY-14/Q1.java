import java.util.Scanner;

public class Q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int found=0;
        int i;
        System.out.print("Enter Size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter element of an array:");
        for(i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Element to Search: ");
        int x = sc.nextInt();
       for(i=0;i<size;i++){
        if(arr[i]==x){
            found=1;
            break;
        }
    }
       if(found==1){
        System.out.println("Element found at position: " +(i+1));
       }else{
        System.out.println("Element doesnot found");
       }
 }
}