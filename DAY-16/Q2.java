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

        int max = 0;
        int maxElement = 0;

        for(int i=0;i<size;i++){
            int count = 1;
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j])
                    count++;
            }

            if(count>max){
                max = count;
                maxElement = arr[i];
            }
        }
        System.out.println("Element with maximum frequency=" +maxElement);
        System.out.println("Frequency= " +max);
    }
}