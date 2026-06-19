import java.util.Scanner;

public class Q2{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row of Matrix: ");
        int r = sc.nextInt();
        System.out.print("Enter col of Matrix: ");
        int col = sc.nextInt();

        int[][] m1 = new int[r][col];

        System.out.println("Enter elements of first matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<col;j++){
                m1[i][j] = sc.nextInt();
            }
        }

        int[][] m2 = new int[r][col];

        System.out.println("Enter elements of second matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<col;j++){
                m2[i][j] = sc.nextInt();
            }
        }

        int c[][] = new int[r][col];

        for(int i=0;i<r;i++){
            for(int j=0;j<col;j++){
                if(m1[i][j]>m2[i][j]){
                    c[i][j] = m1[i][j]-m2[i][j];
                }else{
                    c[i][j] = m2[i][j] - m1[i][j];
                }
            }
        }

        System.out.println("Subtraction of Matrices: ");
         for(int i=0;i<r;i++){
            for(int j=0;j<col;j++){
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
         }
    }
}