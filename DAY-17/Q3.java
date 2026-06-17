import java.util.Scanner;
public class Q3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of First Array: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        System.out.print("Enter Size of Second Array: ");
        int m = sc.nextInt();

        int[] b = new int[m];

        System.out.println("Enter Array Elements: ");
        for(int i=0;i<m;i++){
            b[i] = sc.nextInt();
        }
        boolean found = false;

        System.out.println("Intersection Of Array: ");
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i]==b[j]){
                    System.out.print(a[i]+ " ");
                    found = true;
                    break;
                }
            }
       }
       if(!found){
        System.out.println("No Interection Element Found.");
       }
    }
}