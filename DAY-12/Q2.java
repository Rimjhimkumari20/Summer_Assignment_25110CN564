import java.util.Scanner;

public class Q2 {
    public static int Armstrong(int n){
        int r,sum=0,c=0;
        int num=n;
        while(num!=0){
            num=num/10;
            c++;
        }
        int num1=n;
        while(num1!=0){
            r=num1%10;
            sum=sum + (int)Math.pow(r,c);
            num1=num1/10;
        }
      return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter NUmber:");
        int n = sc.nextInt();
        int sum = Armstrong(n);
        if(sum==n){
            System.out.print(n+ " IS A Armstrong Number");
        }
        else{
            System.out.print("NOT A Armstrong Number");
        } 
    }  
}
