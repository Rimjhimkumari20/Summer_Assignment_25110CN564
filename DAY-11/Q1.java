import java.util.Scanner;

public class Q1 {

    public static int CalculateSum(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter First Number:");
        int a = sc.nextInt();
        System.out.print("Enter Second Number:");
        int b = sc.nextInt();
        int Sum = CalculateSum(a,b);
        System.out.print(Sum);

    }
    
}
