import java.util.Scanner;

public class Q4 {
    public static int Fac(int n){
        int fac=1;
        if(n==0){
            return 1;
        }
        else{
          for(int i=1;i<=n;i++){
            fac=fac*i;
          }
        }
     return fac;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int result = Fac(n);
        System.out.print("The Factorial Of Given Number = " +result);
    }
}
