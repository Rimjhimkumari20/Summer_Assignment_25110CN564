import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of an array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<(size-1);i++){
            for(int j=0;j<(size-1-i);j++){
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        System.out.print("Second largest Element of array is: " +arr[size-2]);
    }
}
