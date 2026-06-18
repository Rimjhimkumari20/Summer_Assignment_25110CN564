import java.util.Scanner;

public class Q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Sorted Array Elements:");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter Element to Search: ");
        int x = sc.nextInt();
        int beg = 0;
        int last = n-1;
        int found=0;

        //Binary Search
        while(beg<=last){
            int mid = (beg+last)/2;
            if(arr[mid]==x){
                found = 1;
                System.out.println("Element found at index: " +mid);
                break;
            }
            else if(x<arr[mid]){
                last = mid-1;
            }
            else{
                beg = mid+1;
            }
          }

        if(found==0){
            System.out.println("Element not Found.");
        }
    }
        
}