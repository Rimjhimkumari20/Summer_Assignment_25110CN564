import java.util.Scanner;

public class Q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row of matrix: ");
        int r = sc.nextInt();
        System.out.println("Enter column of matrix:");
        int col = sc.nextInt();

        int a[][] = new int[r][col];

        System.out.println("Enter matrix elements: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<col;j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Row-wise Sum:");
        for(int i=0;i<r;i++){
            int sum = 0;
            for(int j=0;j<col;j++){
                sum+= a[i][j];
            }
            System.out.println("Sum of row " +(i+1)+ "=" +sum);
        }
    }
}