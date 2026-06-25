import java.util.Scanner;

public class Q1{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of first array: ");
        int size = sc.nextInt();

        int[] arr1 = new int[size];
        System.out.println("Enter Elements: ");
        for(int i=0;i<size;i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter Size of second array: ");
        int size2 = sc.nextInt();

        int[] arr2 = new int[size2];
        System.out.println("Enter Elements: ");
        for(int i=0;i<size2;i++){
           arr2[i] = sc.nextInt();
        }

        int[] merge = new int[size+size2];

        for(int i=0;i<size;i++){
            merge[i] = arr1[i];
        }

        for(int i=0;i<size2;i++){
            merge[size+i] = arr2[i];
        }

        for(int i=0;i<merge.length-1;i++){
            for(int j=0;j<merge.length-1-i;j++){
                if(merge[j]>merge[j+1]){
                    int temp = merge[j];
                    merge[j] = merge[j+1];
                    merge[j+1] = temp;
                }
            }
        }

       System.out.println("Merged Sorted array: ");
       for(int i=0;i<merge.length;i++){
        System.out.print(merge[i]+ " ");
       }

    }
}