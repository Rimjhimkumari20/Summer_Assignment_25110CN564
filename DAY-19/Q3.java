
import java.util.Scanner;

public class Q3{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row of Matrix: ");
        int r = sc.nextInt();
        System.out.print("Enter col of Matrix: ");
        int col = sc.nextInt();

        int[][] m = new int[r][col];

        System.out.println("Enter elements of first matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<col;j++){
                m[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transpose of Matrix: ");
        for(int i=0;i<col;i++){
            for(int j=0;j<r;j++){
                System.out.print(m[j][i]+ " ");
            }
         System.out.println();
        }
    }
}
