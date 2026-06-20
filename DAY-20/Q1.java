import java.util.Scanner;

public class Q1{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row of Matrix: ");
        int r1 = sc.nextInt();
        System.out.print("Enter col of Matrix: ");
        int col1 = sc.nextInt();

        int[][] m1 = new int[r1][col1];

        System.out.println("Enter elements of first matrix: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<col1;j++){
                m1[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter row of Matrix: ");
        int r2 = sc.nextInt();
        System.out.print("Enter col of Matrix: ");
        int col2 = sc.nextInt();
        if(col1!=r2){
            System.out.println("Matrix Multiplication is not Possible.");
            return;
        }

        int[][] m2 = new int[r2][col2];

        System.out.println("Enter elements of second matrix: ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<col2;j++){
                m2[i][j] = sc.nextInt();
            }
        }

        int c[][] = new int[r1][col2];

        for(int i=0;i<r1;i++){
            for(int j=0;j<col2;j++){
                for(int k=0;k<col1;k++){
                    c[i][j] += m1[i][k]*m2[k][j];
                }
            }
        }

        System.out.println("Multiple of Matrices: ");
         for(int i=0;i<r1;i++){
            for(int j=0;j<col2;j++){
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
         }
    }
}
