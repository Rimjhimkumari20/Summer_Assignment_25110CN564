import java.util.Scanner;

public class Q2{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order of matrix: ");
        int n = sc.nextInt();

        int a[][] = new int[n][n];
        int transpose[][] = new int[n][n];

        System.out.println("Enter matrix elments: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                transpose[j][i] = a[i][j];
            }
        }

        boolean Symmetric = true;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j] != transpose[i][j]){
                    Symmetric = false;
                    break;
                }
            }
        }

        if(Symmetric){
            System.out.println("Matrix is Symmetric.");
        }else{
            System.out.println("Matrix is not Symmetric");
        }
    }

}