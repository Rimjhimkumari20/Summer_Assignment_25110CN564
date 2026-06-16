import java.util.Scanner;

public class Q4 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter Array Elements: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<size;i++){
            boolean duplicate = false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    duplicate = true;
                    break;
                }
            }

            if(!duplicate){
                System.out.println(arr[i]+ " ");
            }
        }
    }
}
