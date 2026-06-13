import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int even =0, odd=0;

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
    System.out.println("Number Of Even Elements: " +even);
    System.out.println("Number Of Odd Elements: " +odd);
    }
}
