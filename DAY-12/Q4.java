import java.util.Scanner;

public class Q4 {
    public static int PerfectNumber(int n){
        int Sum = 0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                Sum = Sum+i;
            }
        }
     return Sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int Sum = PerfectNumber(n);
        if(Sum == n){
            System.out.print("Perfect Number");
        }else{
            System.out.print("NOT A Perfect Number");
        }
    }
}
