import java.util.Scanner;

public class Q3 {
    public static void Fib(int n){
        int x=0,y=1,z;
        for(int i=1;i<=n;i++){
            System.out.print(x+ " ");
                z=x+y;
                x=y;
                y=z;
            }
        }
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Terms:");
        int n = sc.nextInt();
        System.out.print("The Fibonacci Series are: ");
        Fib(n);
    } 
}
