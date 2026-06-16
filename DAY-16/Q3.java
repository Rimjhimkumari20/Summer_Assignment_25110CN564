import java.util.Scanner;

public class Q3 {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter Array Elements: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter required sum: ");
        int sum = sc.nextInt();
        boolean found = false;

        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println("Pair:(" +arr[i]+ "," +arr[j]+ ") =" +sum);
                    found  = true;
                }
            }
        }

        if(!found){
            System.out.println("No pair found");
        }
     }
}
