import java.util.Scanner;

public class Q2 {

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

        System.out.println("Union of Array:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+ " ");
        }

        for(int i=0;i<m;i++){
         boolean found = false;
              for(int j=0;j<n;j++){
                if(b[i]==a[j]){
                    found = true;
                    break;
                }
            }
         if(!found){
            System.out.print(b[i]+ " ");
         }
       }

    }

}
